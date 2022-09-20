$(function() {
    var imgIndex = 1;
    var imgArray = new Array("1.jpg", "2.jpg", "3.jpg"); //数组元素个数可调

    $(function() {
        // rollImg();
        //定义一个定时器，每隔4000毫秒执行一下rollImg函数
        setInterval(rollImg, 4000);
    });

    //切换背景图片的函数
    function rollImg() {
        //如果图片的Index大于数组的长度-1，则重新初始化下标为0
        if (imgIndex > imgArray.length - 1) {
            imgIndex = 0;
        }
        //先将Id为bgImg的Div隐藏，隐藏的间隔为900毫秒（可调），完全隐藏后执行回调函数也就是900后面function里面的方法
        $(".login").fadeOut(1000, function() {
            $(".login").css({
                "background-image": "url(./images/" + imgArray[imgIndex] + ")",
                "background-size": $(window).width() + "px"
            });
            imgIndex++;
        });
        //改变Div的background图片后，在调用fadeIn函数将Div显示，显示的间隔为900毫秒（可调）。
        $(".login").fadeIn(1000);
    }
})