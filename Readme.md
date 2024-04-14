به نام خدا


### توضیحاتی اجمالی پیرامون ساختار برنامه

این برنامه، حاوی دو بسته و یک کلاس Main است که منطق نهایی برنامه در آن اجرا میشود. در بسته model ، مدل داده ای پیام ها شامل پیامک و ایمیل وجود دارد که از کلاس Message ارث بری میکند.
همچنین، دارای بسته ای برای سرویس ها است که یک سرویس برای ارسال پیامک و یک سرویس برای ارسال ایمیل در آن تعبیه شده است که یک واسط مختص سرویس پیام رسانی را پیاده سازی میکنند. یکی از دو سرویس پیاده سازی شده مخصوص ارسال پیامک و دیگری برای ارسال ایمیل است.

## بخش دوم: دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

1.	بدون آن که متدی را از واسط Messaging Service حذف کنید ، یک سرویس دیگری را به منظور ارسال پیام از تلگرام با داشتن آیدی مبدا و آیدی مقصد ایجاد کنید - به تبع آن لازم است که یک زیر کلاس برای Message به نام Telegeram Message اضافه کنید که در آن سرویس مورد استفاده قرار گیرد.
2.	سپس یک تابع برای ارسال پیام تلگرامی در واسط Message Service اضافه کنید.
3.	در بدنه‌ی تابع مذکور - مشابه با دیگر توابع پیاده سازی شده -  از یک دستور چاپ ساده بر روی صفحه نمایش استفاده کنید.
4.	در ادامه، سعی کنید که قابلیت ارسال پیام تلگرامی را نیز به برنامه اضافه کنید؛ یعنی کاری کنید که کاربر بتواند در قالب روش سوم پیام خود را با داشتن آیدی مبدا و آیدی مقصد و متن پیام، ارسال کند.
5.	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>&nbsp; محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>&nbsp; عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>&nbsp; شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>&nbsp; افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>&nbsp; افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>2</strong></p>
</td>
<td width="198">
<p>all services</p>
</td>
<td width="141">
<p>افزودن تابع sendtelegrammessage </p>
</td>
<td width="292">
<p>&nbsp; به علت وجود آن در پدر </p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>3</strong></p>
</td>
<td width="198">
<p>telegramMessage</p>
</td>
<td width="141">
<p>افزودن مدل</p>
</td>
<td width="292">
<p>&nbsp; برای کارایی مورد نظر بایستی اضافه شود</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>4</strong></p>
</td>
<td width="198">
<p>telegramService</p>
</td>
<td width="141">
<p>&nbsp; افزودن telegramservice و تابع validation آن</p>
</td>
<td width="292">
<p>&nbsp; برای افزودن service مورد نظر</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>5</strong></p>
</td>
<td width="198">
<p>main</p>
</td>
<td width="141">
<p>&nbsp; افزودن بخش راهنمایی و پاس دادن پارامتر ها</p>
</td>
<td width="292">
<p></p>
</td>
</tr>
<tr>
</tbody>
</table>

مجموع تعداد تغییرات: ..............















### : تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp; در کلاس های مدل یعنی EmailMessage, SmsMessage, Message, TelegramMessage رعایت شده است</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;در کلاس های سرویس رعایت نشده است در واقع در کلاس های EmailMessagingServcie بابت اینکه لازم است sendSmsMessage را تغیر بدهیم و این متد را داشته باشیم این کلاس اصل را رعایت نکرده است پس به دلایل مشابه کلاس های SmsMessagingService, TelegramMessagingService رعایت نشده است</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp; در کلاس های مدل یعنی EmailMessage, SmsMessage, Message, TelegramMessage رعایت شده است</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;در کلاس های سرویس رعایت نشده است زیرا زمانی که میخواهیم کلاس TelegramMessagingService را اضافه کنیم مجبور به ان هستیم که متد هایی جدید و به دیگر کلاس ها اضافه کنیم که نقض اصل OCP است و همین کار را برای دیگر متد ها انجام داده ایم./p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp; در کلاس های مدل یعنی EmailMessage, SmsMessage, Message, TelegramMessage رعایت شده است و همچنین در مورد کلاس های سرویس هم رعایت شده است همه کلاس ها میتوانند جایگزین MessagingService بشوند</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp; در کلاس های مدل یعنی EmailMessage, SmsMessage, Message, TelegramMessage رعایت شده است و این کلاس ها متد هایی که به انها احتیاج ندارند را پیاده سازی نکرده اند </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp; اما در کلاس های سرویس این اصل نقض شده است زیرا ان کلاس ها مجبور به پیاده سازی متد هایی شده اند که به ان احتیاج ندارند برای مثال کلاس SmsMessagingService متد sendEmailMessage را برای چه باید پیاده سازی بکند؟</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp; در کلاس های مدل یعنی EmailMessage, SmsMessage, Message, TelegramMessage رعایت شده و در کلاس های سرویس نیز رعایت شده زیرا کلاس ها وابسته به انتزاع هستند و به یک دیگر وابستگی ندارند   </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

 راهکار ارایه شده به منظور رفع  مشکل        :

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
