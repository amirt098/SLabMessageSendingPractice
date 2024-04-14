به نام خدا

### گام ۱: افزودن یک روش پیام رسانی دیگر


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

مجموع تعداد تغییرات: تابع8، کلاس2، تغییر کد1، افزودن به کلاس2 















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
<p>ISP</p>
</td>
<td width="246">
<p>اینترفیس MessageService قبلی با داشتن سه متد مختلف برای ارسال انواع مختلف پیام‌ها، ممکن است باعث شود که پیاده‌سازی‌های این اینترفیس مجبور به پیاده‌سازی متدهایی شوند که ممکن است از آن‌ها استفاده نکنند.</p>
</td>
<td width="284">
<p>با تبدیل اینترفیس به یک متد عمومی sendMessage که پیام‌های از نوع Message را می‌پذیرد، اینترفیس‌ها تفکیک شده و هر پیاده‌سازی فقط متدهای مرتبط با خود را پیاده‌سازی می‌کند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>SRP</p>
</td>
<td width="246">
<p>کلاس‌های سرویس مسئولیت‌های متعددی دارند، از جمله تایید نوع پیام و ارسال آن.</p>
</td>
<td width="284">
<p>جداسازی منطق تایید نوع پیام از منطق ارسال پیام. ایجاد یک کلاس جدید برای تایید نوع پیام و استفاده از آن در کلاس‌های سرویس.</p>
</td>
</tr>
<tr>
<td width="168">
<p>LSP</p>
</td>
<td width="246">
<p>کلاس‌های سرویس نمی‌توانند به صورت قابل تعویض با یکدیگر استفاده شوند زیرا هر کلاس تنها با نوع خاصی از پیام کار می‌کند.</p>
</td>
<td width="284">
<p>اطمینان از اینکه هر کلاس سرویس می‌تواند هر نوع پیامی را که از نوع Message است، بدون خطا ارسال کند.</p>
</td>
</tr>
<tr>
<td width="168">
<p>DIP</p>
</td>
<td width="246">
<p>کلاس‌های سرویس به کلاس‌های پیاده‌سازی شده وابسته هستند و نه به انتزاعات.</p>
</td>
<td width="284">
<p>استفاده از اینترفیس‌ها یا کلاس‌های انتزاعی برای تعریف وابستگی‌ها و کاهش وابستگی به پیاده‌سازی‌های مشخص.</p>
</td>
</tr>
</tbody>
</table>




### : بررسی مجدد تغییرات مورد نیاز

اگر اصلاحات بر اساس solid انجام شده بود اول از همه دیگر لازم نبود که تابع sendTelegramMessage به دیگر سرویس ها اضافه شود و همچنین سرویس TelegramMessageService راهش به main باز شود و صرفا ورودی ها و ساخت TelegramMessage بررسی میشد. 
تعداد تغیرات به 3 مورد می رسید (اضافه کردن TelegramMessage, TelegramMessageService, تغیرات لازم در main)

### :  جمع بندی

 به کارگیری صحیح اصول SOLID  باعث میشود که تغیرات و توسعه محصول راحت تر و سریع تر شود و از کار های اضافه و بی فایده و همچنین تکراری جلو گیری شود و در نهایت کدی تمیز تر و چابک تر در مقابل تغیرات داشته باشیم
 همجنین اصول  SOLID  چسبندگی(coupling) بین قسمت های مختلف بسیار کمتر کرده و  همروندی کلاس ها را بیشتر میکند 
