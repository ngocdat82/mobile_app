**TRƯỜNG ĐẠI HỌC SƯ PHẠM KỸ THUẬT VINH**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.001.png)**KHOA CÔNG NGHỆ THÔNG TIN**

-----&-----

![logo](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.002.png)

**ĐỒ ÁN MÔN HỌC**

**PHÁT TRIỂN ỨNG DỤNG DI ĐỘNG**



**Giáo viên hướng dẫn	:  Nguyễn Thị Quỳnh Vinh**

**Sinh viên thực hiện     	:  Đỗ Ngọc Đạt**

**MSSV			:  1305180668**

**Lớp				:  DHCTTCK13Z**


**Vinh, năm 2021**





|TRƯỜNG ĐHSPKT VINH|CỘNG HOÀ XÃ HỘI CHỦ NGHĨA VIỆT NAM|
| :-: | :-: |
|<p>**KHOA CNTT**</p><p></p>|***Độc lập - Tự do - Hạnh phúc***|

**PHIẾU GIAO ĐỒ ÁN PHÁT TRIỂN ỨNG DỤNG DI ĐỘNG**

**Họ và tên Sinh viên: ĐỖ NGỌC ĐẠT 		MSSV: 1305180668**

**ĐT:** 0904741666	 			**Email:** blackhat0102.0212@gmail.com


|***STT***|***Họ và tên***|***MSSV***|***SĐT***|***Email***|
| :-: | :-: | :-: | :-: | :-: |
|1|Đỗ Ngọc Đạt|*1305180668*|0904741666|blackhat0102.0212@gmail.com|

Lớp: DHCTTCK13Z: Đại học Công nghệ thông tin khóa 13.

Ngày giao đề:	                                Ngày hoàn thành:  	

1.1. Tên đề tài:  Phát triển ứng dụng di động app nghe nhạc online.

1.2. Nhiệm vụ đồ án: 

\- Tìm hiểu các chức năng, cú pháp xử lý các đối tượng quản lý.

\- Thiết kế : giao diện của ứng dụng nghe nhạc online.

\- Lập trình: xử lý các chức năng của hệ thống.

1.3. Các chức năng của ứng dụng:

\* Thiết kế:

\- Giao diện có bố cục phù hợp; thuận tiện cho người dùng trong việc sử dụng.

\* Chương trình

\- Ứng dụng cho phép người dùng nghe nhạc, phân loại và các chức năng cơ bản khác.

\- Khi người sử dụng có thể tự thêm các bài hát, ca sĩ mà hệ thống còn thiếu sót.

\- Ứng dụng sử dụng 2 loai database, một database online để chứa nhạc cho toàn hệ thống, và 1 database để lưu trữ lịch sử và bài hát yêu thích cho từng thiết bị.

**2. Theo dõi quá trình thực hiện đồ án**

|**Ngày kiểm tra**|**Tiến độ công việc (yêu cầu ghi rõ các nội dung đã hoàn thành)**|**Nhận xét của GVHD**|**Chữ ký của GVHD**|
| :-: | :-: | :-: | :-: |
||Đăng ký tên đề tài |||
||Phân tích chức năng hệ thống|||
||Thiết kế giao diện|||
||Lập trình|||
||Chạy thử và chỉnh sửa|||

**3. Điểm hướng dẫn (điểm chữ và số)** ………………………………………………………………… 

**4. Đồng ý cho bảo vệ hay không đồng ý:** …………………………………………………………...…. 



|<p>**TRƯỞNG BỘ MÔN**</p><p></p><p></p><p></p>|<p>**GIÁO VIÊN HƯỚNG DẪN**</p><p></p><p></p><p>**Nguyễn Thị Quỳnh Vinh**</p>|<p>**SINH VIÊN** </p><p></p><p></p><p>**Đỗ Ngọc Đạt**</p>|
| :-: | :-: | :-: |



Nhận xét của giáo viên hướng dẫn






`                                                           `*Nghệ an, ngày    tháng    năm 2021*

**Giáo viên hướng dẫn**

`               `*(Ký ghi rõ họ tên)*



`							       `**NGUYỄN THỊ QUỲNH VINH**



Nhận xét của giáo viên chấm



`                                                                  `*Nghệ An, Ngày    tháng     năm 20...*

`              `**Giáo viên chấm**

`               `*(Ký ghi rõ họ tên)*


# **MỤC LỤC**
[LỜI MỞ ĐẦU	6](#_Toc78739754)

[CHƯƠNG 1: TỔNG QUAN VỀ HỆ ĐIỀU HÀNH ANDROID	7](#_Toc78739755)

[1.1 Các thành phần phát triển ứng dụng di động	7](#_Toc78739756)

[1.1.1 Những vấn đề cơ bản trong lập trình di động	7](#_Toc78739757)

[1.1.2 Môi trường phát triển ứng dụng di động	7](#_Toc78739758)

[1.1.3 Bộ công cụ phát triển ứng dụng di động	8](#_Toc78739759)

[1.2 Phát triển ứng dụng di động trên google android	9](#_Toc78739760)

[1.2.1 Giới thiệu hệ điều hành Android	9](#_Toc78739761)

[1.2.2 Những đặc tính của android	10](#_Toc78739762)

[1.2.3 Kiến trúc android	12](#_Toc78739763)

[1.2.4 Các thành phần cơ bản của một ứng dụng android	13](#_Toc78739764)

[1.2.4.1 Các thành phần của một ứng dụng	13](#_Toc78739765)

[1.2.4.2. Chu kỳ sống của một thành phần	16](#_Toc78739766)

[CHƯƠNG 2: PHÁT TRIỂN ỨNG DỤNG	18](#_Toc78739767)

[2.1 Phát triển và mô tả ứng dụng	18](#_Toc78739768)

[2.2 Thiết kế và xây dựng chương trình	18](#_Toc78739769)

[2.2.1 Xây dựng cơ sở dữ liệu	18](#_Toc78739770)

[2.2.2 Thiết kê chương trình và cài đặt tính năng	18](#_Toc78739771)

[2.2.2.1 Một số tính năng chính của ứng dụng	18](#_Toc78739772)

[2.2.2.2 Màn hình chính	22](#_Toc78739773)

[2.2.2.3 Màn hình ca sĩ	26](#_Toc78739774)

[2.2.2.4 Màn hình các bài hát của ca sĩ	28](#_Toc78739775)

[2.2.2.4 Màn hình thể loại	29](#_Toc78739776)

[2.2.2.5 Màn hình Albums	30](#_Toc78739777)

[2.2.2.6 Màn hình các bài hát yêu thích	31](#_Toc78739778)

[2.2.2.7 Màn hình trình phát nhạc	32](#_Toc78739779)

[2.2.2.8 Màn hình thêm bài hát	36](#_Toc78739780)

[2.2.2.9 Màn hình thêm ca sĩ	38](#_Toc78739781)

[2.2.2.10 Màn hình các thêm thể loại	39](#_Toc78739782)

[2.2.2.11 Màn hình thêm Albums	40](#_Toc78739783)

[CHƯƠNG 3: CÀI ĐẶT VÀ ĐÓNG GÓI CHƯƠNG TRÌNH	41](#_Toc78739784)

[3.1 Môi trường cài đặt và đóng gói chương trình	41](#_Toc78739785)

[3.1.1 Giới thiệu Java JDK, Android SDK, Android Studio	41](#_Toc78739786)

[3.1.2 Thiết lập môi trường phát triển	41](#_Toc78739787)

[3.2 Đóng gói và chạy chương trình	42](#_Toc78739788)

[3.2.1 Tạo và tích hợp FireBase vào project	42](#_Toc78739789)

[KẾT LUẬN	47](#_Toc78739790)

[TÀI LIỆU THAM KHẢO	48](#_Toc78739791)



# **LỜI MỞ ĐẦU**
Với tốc độ phát triển của công nghệ di động ngày nay và những lợi ích mà nó mang lại cho chúng ta là rất lớn. Không giống như những chiếc điện thoại trước đây chỉ để đàm thoại và gửi nhận tin nhắn, điện thoại hiện nay còn hỗ trợ rất nhiều ứng dụng khác như: gửi / nhận mail, truy cập Internet, xem phim, nghe nhạc, chơi game,… thậm chí nó còn đóng vai trò như một thẻ tín dụng, nó dần đã trở thành một chiếc máy tối tân thu nhỏ. Các chuyên gia về thiết bị di động thế giới ví sự phát triển ứng dụng di động như là những đợt “thủy triều” đang dâng cao. Cùng với sự phát triển của số lượng thuê bao di động là sự đa dạng hoá các dịch vụ hướng đến thiết bị di động. Do đó, xây dựng các ứng dụng cho điện thoại di động đang là một yêu cầu tất yếu trong xu thế hiện nay. Phần mềm cho các điện thoại di động hiện nay rất đa dạng mà đa số là các trò chơi, các chương trình tiện ích như xử lý ảnh, đổi đơn vị đo lường, soạn thảo. Nổi lên trong giai đoạn hiện nay là công nghệ hệ điều hành di động dùng Android. Nền tảng chiếm thị phần cao nhất trên thế giới hiện nay. Không những thế Android đang có những phát triển vượt bậc đáng kinh ngạc. 

Được sự đồng ý của GVHD, em chọn đề tài trong phạm vi đồ án môn học là: “Phát triển ứng dụng di động App báo thức”. Trong phạm vi của đồ án, em tìm hiểu, tổng hợp và vận dụng những kiến thức nền tảng lập trình Android. Dựa trên kiến thức lý thuyết đó, phát triển ứng dụng minh họa trên ngôn ngữ lập trình Android Studio.

Do kinh nghiệm nghiên cứu khoa học, khả năng tổng hợp tài liệu, viết báo cáo còn hạn chế, chưa có nhiều kinh nghiệm nên chắc chắn còn có thiếu sót. Rất mong nhận được sự góp ý, đánh giá của Thầy Cô, bạn bè để hoàn thiện hơn nữa.


# **CHƯƠNG 1: TỔNG QUAN VỀ HỆ ĐIỀU HÀNH ANDROID**

**1.1 Các thành phần phát triển ứng dụng di động**

**1.1.1 Những vấn đề cơ bản trong lập trình di động**

\* ***Đặc điểm chung của lập trình di động (LTDD)***:

\- Dễ tiếp cận, dễ tìm hiểu và dễ học 

\- Giúp lập trình viên tạo ra ứng dụng cho người sử dụng 

\- Giúp hiện thực hóa ý tưởng của lập trình viên 

\- Giúp lập trình viên tạo ra ứng dụng là cầu nối giao tiếp với mọi người trên thế giới qua số lượng người download và sử dụng ứng dụng của mình

LTDĐ là một lĩnh vực đầy năng động và sáng tạo. Phần lớn các nhân viên làm việc trong lĩnh vực LTDĐ đều còn rất trẻ, đầy tài năng, hoài bão và khát vọng.Làm việc trong một cộng đồng như thế, bạn có thể phát huy hết những tiềm năng và năng lực vốn có của bản thân. Đây sẽ là điều kiện thuận lợi giúp bạn thể hiện tối đa óc sáng tạo. Bạn có nhiều thách thức và cơ hội để khẳng định mình. LTDĐ là một trong những nghề có tính cạnh tranh gay gắt và tính đào thải khốc liệt. Bởi đây là lĩnh vực phát triển với tốc độ nhanh nhất và quy tụ nhiều nhất những trí tuệ siêu việt trên thế giới.Tuy nhiên, nếu bạn là người tài năng và có hoài bão, bạn có thể vượt qua tất cả. Hầu hết những nhân vật nổi tiếng trong ngành Công nghệ thông tin đều khởi đầu từ hai bàn tay trắng, nhưng ngày nay họ được cả thế giới ngưỡng mộ.

***\* Các tiêu chí để đánh giá một ứng dụng di động:***

- Dữ liệu là bảo mật tuyệt đối và 100%.
- Chức năng được tạo ra là thuận lợi và hữu ích với người sử dụng.
- Dễ dàng nâng cấp, tương thích với các phiên bản mới
- Ứng dụng là thân thiện với người dùng.
- Luôn có người truy cập và tải ứng dụng về smartphone.
- Tăng doanh thu và lợi nhuận bán hàng nhờ ứng dụng.

**1.1.2 Môi trường phát triển ứng dụng di động**

` `**Có thể chia thành 3 loại hệ điều hành chính**:

\- **Android**: là một hệ điều hành mã nguồn mở dành cho di động được phát triển bởi Google, có mã nguồn mở dựa trên nền tảng Linux được thiết kế dành cho các [thiết bị di động](about:blank) có [màn hình cảm ứng](about:blank) như điện thoại thông minh và máy tính bảng. Ban đầu, Android được phát triển bởi Tổng công ty Android, với sự hỗ trợ tài chính từ Google, sau này được chính Google mua lại vào năm 2005 và hệ điều hành Android đã ra mắt vào năm 2007. Chiếc điện thoại đầu tiên chạy Android là HTC Dream được bán vào ngày 22 tháng 10 năm 2008. Hiện nay Android chiếm gần 80% thị phần hệ điều hành cho di động. Để phát triển ứng dụng trên hệ điều hành này thì ngôn ngữ cần biết là Java. Bởi vì các ứng dụng trên Android, chủ yếu là chạy trên máy ảo Java Dalvik Virtual Machine.

\- **IOS**: là hệ điều hành mã nguồn đóng, được phát triển bởi cty Apple. Các sản phẩm iPhone, iPad chạy hệ điều hành này. Thị phần của IOS nhỏ hơn nhiều so với Android. Tuy nhiên, đây là thị phần chất lượng cao. Người dùng IOS có xu hướng trả tiền để mua ứng dụng cao hơn là người dùng Android. Cho nên đây cũng là một nền tảng được nhiều lập trình viên ưa chuộng. Để phát triển ứng dụng trên IOS, bạn cần phải biết ngôn ngữ Objective-C hoặc Swift .

\- **Windows Phone**: đây là hệ điều hành của cty Microsoft. Microsoft là một công ty phần mềm nổi tiếng thế giới bởi hệ điều hành Windows. Và với cuộc cách mạng về thiết bị di động, Microsoft không thể đứng ngoài. Họ phát triển các hệ điều hành Winphone 7, Win phone 8. Đến thế hệ Windows 10, Microsoft tuyên bố là không còn phân biệt giữa windows phone và desktop OS. Tất cả có chung 1 kiến trúc và phần mềm sẽ tương thích giữa desktop, tablet và di động luôn. Điều này mang lại một sự thuận tiện to lớn cho lập trình viên trên Windows khi kế thừa được phần lớn kiến thức học được trên desktop để chuyển sang di động. Do đó, để phát triển app trên Windows phone, các bạn có thể dùng bất cứ ngôn ngữ nào được hỗ trợ bởi Bộ Visual Studio của Microsoft. Ngày nay, một lựa chọn được đa số bạn trẻ ưa thích đó là C-sharp (C#). 

**1.1.3 Bộ công cụ phát triển ứng dụng di động**

`	`Nếu muốn phát triển một ứng dụng di động, cần biết ngôn ngữ lập trình để xây dựng nó. Tuy nhiên việc lựa chọn một ngôn ngữ lập trình phù hợp cũng không phải là điều dễ dàng. Có rất nhiều ngôn ngữ để lựa chọn, tất cả đều phụ thuộc vào ứng dụng đang muốn xây dụng. Đối với một số loại ứng dụng, thì người phát triển ứng dụng nhiều khi không cần sử dụng hết các tính năng mà một ngôn ngữ nào đó hỗ trợ. Nhưng lại có những trường hợp mà một ứng dụng lại cần được xây dựng trên nhiều ngôn ngữ khác nhau. 

Các ứng dụng di động có thể được phân thành ba loại, bao gồm nền tảng gốc (native), nền tảng lai (hybrid) và đa nền tảng. Native app có thể khai thác được hết sức mạnh và tính năng của hệ điều hành, và chúng luôn là nhanh nhất về mặt hoạt động. Tuy nhiên, bạn cần duy trì các codebase khác nhau cho các nền tảng, bởi vì mỗi nền tảng sử dụng các ngôn ngữ riêng.

\* **Phát triển ứng dụng dạng native (dạng gốc)**

Cách phổ biến nhất để xây dựng các ứng dụng di động là sử dụng các công cụ native (gốc) đi cùng với nền tảng đó. Đối với Android thì nó là Java và Eclipse hoặc là [Android Studio](about:blank) mới của họ, đi cùng với Android SDK. Đối với IOS, thì nó là [Objective-C](about:blank) hoặc Swift và XCode. Đối với Windows Phone thì nó là C# và Visual Studio. bất kỳ ai có ý định nghiêm túc về phát triển ứng dụng di động đa nền tảng thì ít nhất cũng nên phát triển một ứng dụng dạng natively (gốc) đơn giản trên cả Android và IOS. Nó giúp người lập trình dễ hình dung cái gì đang diễn ra dưới các lớp trừu tượng (abstraction) trong một giải pháp phát triển ứng dụng di động đa nền tảng, và nó sẽ cung cấp những điểm mạnh, điểm yếu trong các giải pháp đa nền tảng này.

\* **Xamarin Tools**:

[Các công cụ của Xamarin](about:blank) về cơ bản sẽ cho phép phát triển các ứng dụng Android hoặc iOS bằng ngôn ngữ C# và có thể chia sẻ rất nhiều phần code giữa các ứng dụng với nhau.

Khi viết một ứng dụng sử dụng bộ công cụ của hãng Xamarin thì về cơ bản là chúng ta đang sử dụng một lớp trừu tượng phía trên các SDK thực sự của iOS và Android. Người lập trình thu được kết quả là một ứng dụng native hoàn toàn cùng với giao diện người dùng native trên mỗi nền tảng.

\* **Các ngôn ngữ lập trình cho Android**

\- Java: Dựa vào chỉ số [TIOBE](about:blank), Java là ngôn ngữ lập trình phổ biến nhất tính đến tháng sáu năm 2017. Với một cộng đồng developer lớn mạnh được thành lập từ khá lâu, bạn sẽ dễ dàng nhận được sự hỗ trợ và giúp đỡ về chuyên môn.

Vậy nên khi phát triển ứng dụng di động bằng Java, người lập trình có thể thỏa sức sáng tạo để xây dựng bất kì loại ứng dụng nào. 

\- Kotlin: là ngôn ngữ lập trình được phát triển bởi JetBrains, một công ty Cộng Hòa Czech phát triển ItelliJ IDEA, một IDE khá nổi tiếng. Đội ngũ lập trình Android của Google gần đây đã thông báo về việc họ đang chính thức thêm hỗ trợ cho Kotlin. Kotlin được phát triển để giải quyết một vài vấn đề tồn tại trong Java. Theo đa số người ủng hộ việc dùng Kotlin, thì syntax của nó đơn giản và gọn hơn, do đó ít dẫn tới xảy ra việc dòng code rườm rà, dài dòng. Điều này có tác dụng giúp người viết tâp trung trong việc giải quyết vấn đề hơn là cố xoay sở với những câu lệnh dài dòng phức tạp. Ngoài ra, còn có thể kết hợp Kotlin và Java cùng nhau trong dùng một dự án, khai thác hết thế mạnh của cả 2 ngôn ngữ.

**1.2 Phát triển ứng dụng di động trên google android**

**1.2.1 Giới thiệu hệ điều hành Android**

\- Năm 2003, Android Inc. được thành lập bởi Andy Rubin, Rich Miner, Nick Sears và Chris White tại California. 

\- Năm 2005, Google mua lại Android Inc và bắt đầu nuôi ý tưởng tự sản xuất điện thoại di động. 

\- Năm 2007, tổ chức OHA (Open Handset Alliance) được thành lập với hơn 80 công ty trong lĩnh vực kỹ thuật điện tử bao gồm các công ty chuyên về phần cứng, phân phối thiết bị di động đến các công ty phần mềm, sản xuất chất bán dẫn… Có thể kể đến một số công ty nổi tiếng như Samsung, Motorola, LG, HTC, T-Mobile, Vodafone, ARM và Qualcomm…  

\- Năm 2008, Google ra mắt chiếc di động đầu tiên đồng thời open source bản SDK (Software Development Kit) phiên bản 1.0. 

\- Năm 2010, Google khởi đầu dòng thiết bị Nexus với thiết bị đầu tiên của HTC là Nexus One. 

\- Năm 2013, ra mắt loạt thiết bị phiên bản GPE. 

\- Năm 2014, Google công báo Android Wear, hệ điều hành dành cho các thiết bị đeo được. 

Các phiên bản của hệ điều hành Android: 

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.003.png) 

*Hình 1 : Các phiên bản hệ điều hành Android.*

**1.2.2 Những đặc tính của android**

\- Ứng dụng framework cho phép tái sử dụng và thay thế các thành phần.

\- Dalvik máy ảo được tối ưu hóa cho các thiết bị di động, cung cấp một tối ưu hóa thiết bị di động trên máy ảo Java.

\- Tích hợp trình duyệt dựa trên động cơ WebKit mã nguồn mở.

\- Tối ưu hóa đồ họa được hỗ trợ bởi một tùy chỉnh đồ họa thư viện 2D, đồ họa 3D dựa trên những đặc điểm kỹ thuật OpenGL ES 1,0 (tùy chọn tăng tốc phần cứng)

\- SQLite cho việc lưu trữ dữ liệu cấu trúc, một hệ thống cơ sở dữ liệu có cấu trúc.

\- Phương tiện truyền thông hỗ trợ cho âm thanh phổ biến, video và vẫn còn định dạng hình ảnh ( MPEG4, H.264, MP3, AAC, AMR, JPG, PNG, GIF).

\- GSM cuộc gọi điện thoại di động đang thực sự ở mức mạch phần cứng phải được thực hiện, cấp phần mềm không thể đạt được, nhưng Android yêu cầu nền tảng phải có khả năng điện thoại GSM, không quá nhiều tính năng đặc trưng của tác động này, vì nó đặt ra các phần cứng tối thiểu các yêu cầu đặc điểm kỹ thuật.

\- Bluetooth, EDGE, 3G và WiFi (phụ thuộc phần cứng).

\- Camera, GPS, la bàn và gia tốc (phụ thuộc phần cứng).

\- Môi trường phát triển phong phú bao gồm một mô phỏng thiết bị, công cụ để gỡ lỗi, bộ nhớ và hồ sơ (profiling) hiệu suất, và một plugin cho IDE Eclipse.

**Ưu điểm:**

\+ Là hệ điều hành có mã nguồn mở nên khả năng tuỳ biến cao, có thể tùy ý chỉnh sửa mà không có sự can thiệp hay cấm cản từ Google.

\+ Đa dạng sản phẩm, rất nhiều hãng điện thoại, thiết bị công nghệ đã ưu ái chọn Android cho thiết bị của họ, giá cả thì hợp lý từ bình dân đến cao cấp.

\+ Kho ứng dụng Google Play Store đồ sộ.

\+ Thân thiện và dễ sử dụng.

\+ Khả năng đa nhiệm, chạy cùng lúc nhiều ứng dụng cao.

**Nhược điểm:**

\+ Dễ nhiễm phần mềm độc hại và virus. Do tính chất mã nguồn mở, nhiều phần mềm không được kiểm soát có chất lượng không tốt hoặc lỗi bảo mật vẫn được sử dụng.

\+ Kho ứng dụng quá nhiều dẫn đến khó kiểm soát chất lượng, thiếu các ứng dụng thật sự tốt.

\+ Cập nhật không tự động với tất cả thiết bị. Khi một phiên bản hệ điều hành mới ra mắt, không phải tất cả sản phẩm đều được cập nhật, thậm chí nếu muốn trải nghiệm phải thường xuyên phải mua mới thiết bị.

**Các thiết bị đang sử dụng Android:**

Bản chất mở và cho phép thay đổi của Android giúp nó xuất hiện trên các thiết bị điện tử khác, như [laptop](about:blank) và netbook, smartbook, [Smart tivi](about:blank) và máy ảnh. Hơn thế nữa, hệ điều hành Android còn được ứng dụng trong kính mắt thông minh (Project Glass), đồng hồ đeo tay, tai nghe, máy nghe nhạc bỏ túi, điện thoại để bàn, và máy trò chơi điện tử chạy Android.

\+ Hiện tại Samsung vẫn đang dẫn đầu thị trường Android với nhiều thiết bị điện thoại và máy tính bảng từ bình dân đến cao cấp như: Galaxy V, Galaxy Core 2, Galaxy A3, Galaxy A5, Galaxy S5, Galaxy Note 4, …

\+ Điện thoại Sony: Xperia Z3, Xperia Z3 Compact, Xperia Z2,  Xperia T2 Ultra, …

\+ Điện thoại HTC: HTC Desire Eye, HTC One E8,  HTC Desire 510…

\+ Điện thoại Oppo: Oppo Find 7a, Oppo R5, Oppo N1 Mini, Oppo R1…

\+ Máy tính bảng chạy Android: Sony Xperia Z3 Tablet Compact, Samsung Galaxy Tab S 10.5 (SM-T805), Samsung Galaxy Tab S 8.4 (SM-T705), Google HTC Nexus 9 Volantis, Lenovo Yoga Tablet 2 Pro, Asus MeMo Pad 8, Dell Venue 8.

**1.2.3 Kiến trúc android** 

Có thể hiểu Android Software Stack bao gồm nhân Linux, tập các thư viện C/C++ được truy xuất bởi tầng ứng dụng để sử dụng các dịch vụ, các bộ quản lý thực thi và quản lý ứng dụng. Mỗi tầng đều có chức năng vai trò riêng biệt với nhau: 

\- Linux kernel – lõi chính của toàn hệ thống bao gồm các điều khiển phần cứng, bộ quản lý xử lý và bộ nhớ, bảo mật, kết nối mạng, bộ quản lý năng lượng.  

\- Libraries – thực thi trên tầng nhân Linux, bao gồm các thư viện lõi khác nhau của C/C++ như libc và SSL. Có các dạng sau: 

\+ Thư viện hỗ trợ phát các tập tin đa truyền thông. 

\+ Bộ quản lý hiển thị 

\+ Thư viện hỗ trợ đồ họa OpenGL 2D và 3D 

\+ SQLite hỗ trợ lưu trữ cơ sở dữ liệu

+SSL và WebKit cho phép tương tác với trình duyệt và bảo mật Internet. 

\- Android Run Time – đây chính là điểm làm nên sự khác biệt giữa thiết bị Android và thiết bị Linux. Bên trong thành phần này bao gồm máy ảo Dalvik và thư viện lõi. Dalvik VM – dạng máy ảo cho phép tối ưu hóa để có thể chạy được nhiều tiến trình một các hiệu quả, dựa trên nhân Linux các máy ảo cho phép quản lý các tiểu trình và quản lý bộ nhớ ở bậc thấp. 

Android Run Time ngoài tăng tốc độ cho ứng dụng còn làm nền cho tầng Application Framework kết nối đến. 

\- Core Libraries – mặc dù hầu hết các ứng dụng Android viết bằng ngôn ngữ Java nhưng Dalvik không phải là máy ảo Java. Các thư viện lõi Android sẽ cung cấp hầu hết các chức năng chính có thể có trong thư viện Java cũng như thư viện riêng biệt của Android. 

\- Application Framework – cung cấp các lớp cho việc tạo ra các ứng dụng. Bên cạnh đó nó cũng chứa các lớp trừu tượng cho phép truy nhập phần cứng, quản lý giao diện người dùng và tài nguyên của ứng dụng. 

\- Application Layer – gồm các ứng dụng được tích hợp sẵn và các ứng dụng của hãng thứ ba. Tầng ứng dụng trong Android Run Time sử dụng các lớp từ tầng Application Framework để thực thi ứng dụng.

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.004.jpeg)

`                	`*Hình 2 : Các ứng dựng Applications*

**1.2.4 Các thành phần cơ bản của một ứng dụng android**

*1.2.4.1 Các thành phần của một ứng dụng*

Có bốn khối để xây dựng một ứng dụng Android: 

- Activity (Hoạt động)
- Intent Receiver (Trình thu phát sóng)
- Service (Dịch vụ)
- Content Provider (Trình cung cấp nội dung) 

Không phải mọi ứng dụng cần có tất cả bốn, nhưng ứng dụng của bạn sẽ được viết dựa trên một số sự kết hợp này.

**\* Activity (Hoạt động)**

` `Một hoạt động đại diện cho một giao diện người sử dụng trực quan, ở đó người dùng có thể thực hiện những gì họ muốn làm. Là hoạt động phổ biến nhất của bốn khối xây dựng Android. Một hoạt động thường là một màn hình duy nhất trong ứng dụng của bạn. Mỗi hoạt động được thực hiện như là một lớp duy nhất mà kéo dài các lớp cơ sở hoạt động. Lớp đó sẽ hiển thị một giao diện người dùng bao gồm xem và trả lời các sự kiện. Hầu hết các ứng dụng bao gồm nhiều màn hình. Ví dụ, một chương trình nhắn tin SMS có thể bao gồm các hoạt động là: một hoạt động thể hiện một danh sách các số liên lạc (có thể gửi được tin nhắn), một hoạt động thể hiện một trang để người dùng viết tin nhắn và lựa chọn gửi đến một địa chỉ nào đó và một hoạt động khác cho phép xem lại các tin đã gửi hoặc chỉnh sửa chúng. Mặc dù tất cả các hoạt động kết hợp lại mới tạo nên một ứng dụng có giao diện cho người sử dụng, nhưng mỗi hoạt động vẫn hoạt động độc lập với những cái còn lại. Mỗi một hoạt động là một lớp con của lớp cơ sở Activity. 

Một ứng dụng có thể bao gồm một hoặc nhiều hoạt động. Mỗi hoạt động hoạt động ra sao, giao diện trông thế nào là do ứng dụng quyết định và thiết kế. Thông thường thì có một hoạt động được đánh dấu là hoạt động đầu tiên và người dùng có thể thấy nó ngay khi ứng dụng được khởi chạy. Mỗi một hoạt động thì có một cửa sổ làm việc để sử dụng và vẽ trên đó. Thông thường mỗi cửa sổ này đều lấp đầy màn hình. Nhưng cũng có khi nó nhỏ hơn và nổi ngay trên một cửa sổ làm việc khác. Những nội dung trực quan ở mỗi cửa sổ làm việc được cung cấp bởi một hệ thống các gốc nhìn, những đối tượng được thừa kế từ lớp cơ sở góc nhìn. Mỗi một góc nhìn thì điều khiển một khu vực có dạng hình chữ nhật đặc biệt bên trong cửa sổ. Mỗi một lớp cha, gốc nhìn cha, bao gồm và tổ chức những sắp xếp cho các lớp con của nó. Những gốc nhìn là lá (không có con) vẽ trên khu vực mà chúng điều khiển và trả lời các hoạt động do người dùng tác động vào khu vực nó kiểm soát. Do đó có thể nói, mỗi một gốc nhìn là nơi mà hoạt động tương tác với người sử dụng. Ví dụ, một view có thể hiển thị một ảnh mà khi người sử dụng click vào cái ảnh đó sẽ có một action được thực thi. Android có sẵn một số khung nhìn cho bạn sử dụng như là button (nút), text field (trường văn bản), scroll bar (thanh cuộn), menu item (danh mục), check box (hộp check),.… Một view được đặt vào bên trong một cửa sổ của activity bởi phương thức Activity.setContentView(). Object ContentView là đối tượng gốc của cây phân cấp khung nhìn. 

Khi một màn hình mới mở ra, màn hình trước đó được tạm dừng và đưa vào lịch sử một chồng. Người dùng có thể điều hướng lịch sử xếp (history stack), thông qua màn hình trước đó mở ra trong lịch sử. Màn hình cũng có thể chọn được loại bỏ khỏi lịch sử ngăn xếp khi nó không thích hợp để duy trì được. Android giữ ngăn xếp lịch sử cho mỗi ứng dụng đưa ra từ màn hình chủ. 

**\* Intent Receiver (Trình thu phát sóng)** 

Intent Receiver** là một thành phần không làm gì cả nhưng lại nhận và tương tác với các thông báo được đưa ra, thực hiện một hành động khi có sự kiện ngoài (ví dụ: Phone Ring). Bạn có thể sử dụng một IntentReceiver khi bạn muốn mã trong ứng dụng của bạn để thực thi trong phản ứng với một sự kiện bên ngoài, ví dụ thông báo rằng timezone đã được thay đổi, rằng pin yếu hoặc thông báo người dùng vừa đổi ngôn ngữ hiển thị. Một ứng dụng cũng có thể bắt đầu phát thông báo, ví dụ để cho các ứng dụng khác biết dữ liệu trên mạng đã được tải về thiết bị và sẵn sàng sử dụng. Một ứng dụng cũng có thể không có bất kì bộ thu phát nào nếu chúng không cần trả lời các thông báo từ thiết bị hay ứng dụng khác. Tất cả các bộ thu phát thì kế thừa từ lớp cơ sở BroadcastReceiver. Các bộ thu phát thì không có giao diện sử dụng, tuy nhiên chúng có thể khởi động một ứng dụng khi đáp lại thông tin mà chúng nhận được. Hoặc chúng có thể sử dụng NotificationManager để cảnh báo cho người dùng biết. Các thông báo có thể gây chú ý tới người dùng theo những cách khác nhau, ví dụ như nháy đèn màn hình, rung, chơi nhạc,.… Thông thường thì chúng tạo ra một thông báo “cứng” trên màn hình hiện thời của thiết bị, để user có thể thấy và đọc những thông báo đó. 

**\* Service (Dịch vụ)**
**
`  `Một dịch vụ thì không có một giao diện trực quan, nhưng nó có thể chạy ngầm định trên thiết bị và không giới hạn thời gian hoạt động, đoạn mã chạy liên tục không cần có UI (Media Player). Ví dụ như một dịch vụ giúp thiết bị có thể chơi nhạc ngoài desktop trong khi người sử dụng đang làm công việc khác, hay nó có thể tải dữ liệu trên mạng về máy, hoặc tính toán cái gì đó và sẵn sàng cung cấp kết quả khi có một hoạt động cần đến nó. Mỗi một dịch vụ thì được mở rộng từ lớp cơ sở dịch vụ. Ví dụ đơn giản nhất là trình chơi nhạc từ một danh sách chơi nhạc. Trình chơi nhạc chắc chắn có một hoặc nhiều hơn một hoạt động có khả năng để người sử dụng chọn bài hát và bắt đầu chơi chúng. Tuy nhiên người sử dụng mong muốn khi thoát khỏi trình chơi nhạc, nhạc vẫn được chơi bình thường, để giữ cho nhạc vẫn tiếp tục được chơi thì hoạt động của trình chơi nhạc gọi một dịch vụ đến và chạy nó ở dạng ngầm định. Hệ thống sẽ tiếp tục chạy dịch vụ này ngay cả khi hoạt động thoát ra ngoài (không còn trên màn hình nữa). Hoàn toàn có thể kết nối tới một dịch vụ đang chạy hoặc nếu chúng chưa bắt đầu chạy thì có thể khiến chúng chạy. Khi đã kết nối với dịch vụ, bạn có thể giao tiếp với nó thông qua một giao diện mà dịch vụ hiển thị. Ví dụ với dịch vụ chơi nhạc thì người sử dụng có thể chơi, dừng, tạm dừng, tới bài tiếp theo, tua lại hoặc chơi lại từ đầu. Giống như hoạt động và các thành phần khác, dịch vụ chạy trên luồng xử lý chính của ứng dụng. Do đó chúng không thể kết nối các thành phần khác, hay can thiệp vào giao diện của người dùng. Chúng thường sinh ra một luồng mới cho các nhiệm vụ bị chi phối thời gian thực hiện. 

**\* Content Provider (Trình cung cấp nội dung)**
**
` `Một content provider tạo ra một tập hợp các dữ liệu đặc biệt của ứng dụng này mà các ứng dụng khác có thể dùng chung. Dữ liệu này có thể được lưu ở file hệ thống, trong cơ sở dữ liệu SQLite hoặc trong bất cứ chỗ nào lưu trữ được trên thiết bị. Rất hữu ích nếu bạn muốn ứng dụng của bạn với dữ liệu được chia sẻ với các ứng dụng khác. Một nhà cung cấp nội dung là một lớp mà thực hiện một bộ tiêu chuẩn của các phương pháp để cho các ứng dụng lưu trữ và lấy các kiểu dữ liệu được xử lý bởi nhà cung cấp nội dung.



*1.2.4.2. Chu kỳ sống của một thành phần*

Các thành phần ứng dụng có một chu kỳ sống, tức là mỗi thành phần từ lúc bắt đầu khởi tạo và đến thời điểm kết thúc. Giữa đó, đôi lúc chúng có thể là hành động (active) hoặc không hành động (inactive), hoặc là trong trường hợp những hành động nó có thể hiển thị (visible) hoặc không hiển thị (invisible).

Bên trong hệ thống các hành động (activity) được quản lý như một hành động ngăn xếp (activity stack). Khi một Activity mới được start, nó được đặt ở đỉnh của stack và trở thành activity đang chạy, activity trước sẽ ở bên dưới activity mới và sẽ không thấy trong suốt quá trình activity mới tồn tại. 

Nếu người dùng nhấn nút Back thì activity kết tiếp của stack sẽ di duyển lên và trở thành active. 

[](about:blank)![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.005.jpeg)

*Hình 3 : Hoạt động của một chu kỳ sống*

Các trạng thái của chu kỳ sống

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.006.jpeg)

*Hình 4 :  Các trạng thái của chu kỳ sống*


Một Activity chủ yếu có 3 chu kỳ chính sau:

1. Active hoặc running: Khi Activity được chạy trên màn hình. Activity này tập trung vào những thao tác của người dùng trên ứng dụng.
1. Paused: Activity được tạm dừng (paused) khi mất focus nhưng người dùng vẫn trông thấy. Có nghĩa là một Activity mới ở trên nó nhưng không bao phủ đầy màn hình. Một Activity tạm dừng là còn sống nhưng có thể bị kết thúc bởi hệ thống trong trường hợp thiếu vùng nhớ.
1. Stopped: Nếu nó hoàn toàn bao phủ bởi Activity khác. Nó vẫn còn trạng thái và thông tin thành viên trên nó. Người dùng không thấy nó và thường bị loại bỏ trong trường hợp hệ thống cần vùng nhớ cho tác vụ khác.


# **CHƯƠNG 2: PHÁT TRIỂN ỨNG DỤNG**
# **2.1 Phát triển và mô tả ứng dụng**
Hiện nay khi điện thoại thông minh được sử dụng ngày càng nhiều thì ứng dụng nghe nhạc là một trong những ứng dụng giải trí được ưa chuộng nhất hiện nay. Ứng dụng giúp con người thư giã mọi lúc mọi nơi. Các trang web và App nghe nhạc online hiện nay có khá nhiều. Tuy nhiên trong khuôn khổ 1 đồ án môn học em muốn tìm hiểu cách thức xây dựng một ứng dụng nghe nhạc cho phép người dùng:

\- Nghe nhạc theo thể loại, ca sĩ, nghệ  sĩ.

\- Nghe nhạc theo Albums.

\- Lưu trữ các bài hát yêu thích để có thể nghe lại các bài hát yêu thích một cách nhanh chóng.

\- Có thể thêm bài hát, ca sĩ,…
# **2.2 Thiết kế và xây dựng chương trình**
# **2.2.1 Xây dựng cơ sở dữ liệu**
Ứng dụng sử dụng song song 2 cơ sở dữ liệu:

\- Một cơ sở dữ liệu được lưu trên máy chủ để lưu trữ các bài hát

\- Một cơ sở dữ liệu để lưu các phần lịch sử và yêu thích của từng cá nhân cho từng thiết bị. 
# **2.2.2 Thiết kê chương trình và cài đặt tính năng**
# *2.2.2.1 Một số tính năng chính của ứng dụng*
**+ Phát nhạc**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.007.png)

**+ Dừng hẳn nhạc**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.008.png)

**+ Tạm dừng, tiếp tục nhạc**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.009.png)

**+ Bài hát kế tiếp**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.010.png)

**+ Bài hát trước đó**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.011.png)

**+ Tính thời gian bài hát**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.012.png)

**+ Thời gian phát của bài hát**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.013.png)

**+ Tự chuyển bài**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.014.png)

**+ Chia tỉ lệ thanh seekbar, chạy theo thời gian phát của bài hát và lấy giá trị để tua bài hát**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.015.png)

**+ Kiểm tra nhạc đang phát hay dừng**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.016.png)
**


**+ Kiểm tra seekbar, nếu chưa đầy thì tiếp tục phát, đầy thì next bài hoặc lặp lại bài hát đó**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.017.png)

**+ Lọc bài hát theo tên**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.018.png)

**+ Bắt sự kiện khi click vào 1 item**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.019.png)

**+ Reset lại danh sách gần đây**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.020.png)

# *2.2.2.2 Màn hình chính*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.021.png)

*Hình 19 : Giao diện màn hình chính*

*-* Chức năng của màn hình này

\+ Hiển thị thanh tìm kiếm các bài hát

\+ Hiển thị các bài hát có trong hệ thống

\+ Hiển thị lịch sử các bài hát đã nghe gần đây

\+ Hiển thị các bài hát mới nhất của hệ thống

\+ Hiển thị nút thêm bài hát mới vào hệ thống

\+ Hiển thị các nút chuyển màn hình sang các trang Albums, Ca sĩ,…

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.022.png)|TextInputEditText tìm kiếm bài hát|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.023.png)|RecyclerView hiển thị top 10 ài hát được nghe nhiều nhất (Cuộn theo chiều ngang)|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.024.png)|TextView và RecyclerView hiển thị lịch sử các bài hát đã nghe (Cuộn theo chiều ngang)|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.025.png)|TextView và RecyclerView hiển thị các bài hát mới của hệ thống (Cuộn theo chiều ngang) |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.026.png)|Button thêm bài hát: Chuyển đến màn hình thêm bài hát|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.027.png)|BottomNavigationView: Hiển thị danh sách các View và nằm cố định ở cuối màn hình|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.028.png)|LinearLayout hiển thị nhạc đang phát|

\- **Xây dựng chức năng**

**+** Lấy dữ liệu từ máy chủ

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.029.png)

**+** Tìm kiếm các bài hát: Được tìm kiếm thông qua 1 TextInputEditText. Khi người dùng gõ từ khóa tìm kiếm thì một danh sách các bài hát có tên gần giống với tên bài hát được hiển thị phía dưới bằng một listview/RecyclerView

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.030.png)



\+ Lấy dữ liệu đổ vào mảng và hiển thị bài hát

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.031.png)

\+ Khi nhấn vào bài hát muốn phát

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.032.png)

\+ Mở trình phát nhạc

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.033.png)

\+ Lấy dữ liệu bài hát

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.034.png)


\+ Lọc bài hát mới được thêm

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.035.png)

\+ Dừng và lưu thời gian để có thể tiếp tục

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.036.png)

+Bài hát trước đó

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.037.png)

\+ Bài hát tiếp theo

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.038.png)

\+  Hiện trình phát nhạc lớn

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.039.png)

\+ Chuyển màn hình qua các trang Albums, ca sĩ,…

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.040.png)



# *2.2.2.3 Màn hình ca sĩ*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.041.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.042.png)

*Hình 20 : Giao diện ca sĩ*

\- Chức năng của màn hình này

\+ Hiển thị các ca sĩ có trong hệ thống

\+ Khi nhấn vào ca sĩ nào thì hiển thị danh sách các bài hát của ca sĩ đó

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.043.png)|TextInputEditText tìm kiếm ca sĩ|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.044.png)|RecyclerView hiển thị các ca sĩ có trong hệ thống (Cuộn theo chiều dọc)|

\- **Xây dựng chức năng**

**+** Lấy dữ liệu các ca sĩ từ máy chủ

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.045.png)

**+** Tìm kiếm ca sĩ: Được tìm kiếm thông qua 1 TextInputEditText. Khi người dùng gõ từ khóa tìm kiếm thì một danh sách các ca sĩ có tên gần giống với tên ca sĩ được hiển thị phía dưới bằng một listview/RecyclerView

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.046.png)

**+** Hiển thị các ca sĩ có trong máy chủ

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.047.png)



\+ Hiển thị các ca khúc của ca sĩ mình chọn

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.048.png)
# *2.2.2.4 Màn hình các bài hát của ca sĩ*

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.049.png)

*Hình 21: Danh sách bài hát của ca sĩ*

\- Chức năng của màn hình này

\+ Hiển thị các bài hát có trong hệ thống của ca sĩ này

\+ Chọn bài hát nào thì phát bài hát đấy

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.022.png)|TextInputEditText tìm kiếm bài hát|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.050.png)|RecyclerView hiển thị các bài hát có trong hệ thống của ca sĩ đã chọn (Cuộn theo chiều dọc)|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.051.png)|RelativeLayout hiển thị thông tin bài hát|

\- **Xây dựng chức năng**

**+** Tìm kiếm các bài hát: Được tìm kiếm thông qua 1 TextInputEditText. Khi người dùng gõ từ khóa tìm kiếm thì một danh sách các bài hát của ca sĩ đã được chọn có tên gần giống với tên bài hát được hiển thị phía dưới bằng một listview/RecyclerView

\+ Các tính năng khi click vào bài hát tương tự như ở phần trang chủ
# *2.2.2.4 Màn hình thể loại*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.052.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.053.png)

*Hình 22: Màn hình thể loại*

-Chức năng của màn hình này

\+ Hiển thị các thể loại nhạc có trong hệ thống

\+ Khi chọn vào thể loại nào thì hiển thị tất cả bài hát của thể loại đó

\- Các View/Control tương tự như ở màn hình ca sĩ

\- Xây dựng chức năng: Tương tự như phần màn hình ca sĩ
# *2.2.2.5 Màn hình Albums*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.054.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.055.png)

*Hình 23: Màn hình Albums*

\- Chức năng của màn hình này

\+ Hiển thị các Album nhạc trong hệ thống

\+ Khi chọn Albums nào thì hiển thị tất cả các bài hát của Albums đó

\- Các View/Control tương tự như ở màn hình ca sĩ

\- Xây dựng chức năng: Tương tự như phần màn hình ca sĩ
# *2.2.2.6 Màn hình các bài hát yêu thích*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.056.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.057.png)

*Hình 24: Màn hình Yêu thích*

\- Chức năng của màn hình này

\+ Hiển thị các bài hát đã được người dùng đánh dấu yêu thích

\+ Khi chọn bài hát nào thì phát bài hát đó

\- Các View/Control tương tự như ở màn hình danh sách các bài hát của ca sĩ

\- Xây dựng chức năng

**+** Tìm kiếm các bài hát: Được tìm kiếm thông qua 1 TextInputEditText. Khi người dùng gõ từ khóa tìm kiếm thì một danh sách các bài hát trong phần yêu thích có tên gần giống với tên bài hát được hiển thị phía dưới bằng một listview/RecyclerView

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.058.png)



\+ Lấy dữ liệu và hiển thị

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.059.png)
# *2.2.2.7 Màn hình trình phát nhạc*

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.060.png)

*Hình 25: Màn hình trình phát nhạc*

\- Chức năng của màn hình này

\+ Hiển thị hình ảnh của bài hát

\+ Hiển thị tên bài hát và ca sĩ thể hiện bài hát

\+ Hiển thị tổng thời gian của bài hát

\+ Hiển thị thời gian đã phát được của bài hát

\+ Hiển thị tiến trình của bài hát

\+ Tắt bật chế độ phát lặp lại của bài hát

\+ Tua bài hát đến thời điểm mà mình mong muốn

\+ Chuyển đến bài hát tiếp theo

\+ Trở về bài hát trước đó

\+ Thêm bài hát vào danh sách yêu thích

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.061.png)|ImageView Hiển thị hình ảnh bài hát|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.062.png)|2 TextView hiển thị tên bài hát và ca sĩ trình bày bài hát|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.063.png)               ![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.064.png)|2 Text view hiển  thị thời gian đã phát được và tổng thời gian của bài hát|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.065.png)|Thanh SeekBar hiển thị tiến trình của bài hát (có thể trượt điều chỉnh)|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.066.png)       ![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.067.png)|2 ImageView hiển thị chế độ lặp lại và thêm vào danh sách yêu thích (Có thể nhấn)|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.068.png)|Các ImageView điều chỉnh trở lại bài hát trước, tạm dừng, tiếp tục, chuyển đến bài hát tiếp theo|

\- **Xây dựng chức năng**

**+ Hiển thị ảnh bài hát và xoay ảnh khi phát nhạc**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.069.png)

**+ Hiển thị tên bài hát và ca sĩ**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.070.png)

**+ Hiển thị thời gian nhạc**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.071.png)

**+ Lặp lại**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.072.png)

**+ Tự chuyển bài**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.073.png)

**+ Yêu thích**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.074.png)

**+ Các thao tác điều khiển**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.075.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.076.png)

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.069.png)

**+ Hiển thị ngẫu nhiên background**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.077.png)

**+ Đóng trình phát lớn**

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.078.png)

# *2.2.2.8 Màn hình thêm bài hát*

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.079.png)

*Hình 26: Giao diện thêm bài hát*

\- Chức năng của màn hình này

\+ Cho phép nhập các thông tin của bài hát để thêm vào hệ thống

\+ Thêm bài hát vào hệ thống

\+ Trường hợp bài hát đã có trên hệ thống thì sẽ cập nhật lại dữ liệu theo dữ liệu vừa nhập vào với tên bài hát là khóa

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.080.png)|TextView hiển thị tên của Layout thêm bài hát|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.081.png)|3 TextInputEditText để nhập tên bài hát, địa chỉ dữ liệu nhạc và địa chỉ dữ liệu ảnh của bài hát|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.082.png)|3 Spinner để chọn ca sĩ, thể loại và Albums cho bài hát|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.083.png)|ImageView để mở phần thêm ca sĩ, thêm thể loại hoặc thêm albums mới vào hệ thống|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.084.png)|Button  thêm nhạc vào hệ thống sau khi đã điền đầy đủ thông tin|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.085.png)|Button đóng Layout thêm bài hát|

\- Xây dựng chức năng

Lấy dữ liệu về thể loại trên máy chủ

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.086.png)

Tương tự cho ca sĩ và album

- Hiển thị các ca sĩ, thể loại và album

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.087.png)

- Khi click vào Spinner

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.088.png)

- Khi click vào nút thêm bài hát
- ![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.089.png)
# *2.2.2.9 Màn hình thêm ca sĩ*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.090.png)

*Hình 27: Giao diện thêm ca sĩ*

\- Chức năng của màn hình này

\+ Cho phép nhập tên và đường dẫn đến dữ liệu hình ảnh của ca sĩ

\+ Thêm ca sĩ vào hệ thống

\- Các View/Control

|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.091.png)|TextView tiêu đề|
| - | - | - |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.092.png)|TextInputEditText nhập tên ca sĩ và đường dẫn đến dữ liệu hình ảnh của ca sĩ|
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.084.png)|Button thêm dữ liệu ca sĩ vào hệ thống |
|+|![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.085.png)|Button đóng layout thêm ca sĩ|

\- Xây dựng chức năng

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.093.png)
# *2.2.2.10 Màn hình các thêm thể loại*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.094.png)

*Hình 28:Giao diện thêm thể loại bài hát*

\- Chức năng của màn hình này

\+ Cho phép nhập tên và đường dẫn đến dữ liệu hình ảnh của thể loại

\+ Thêm thể loại vào hệ thống

\- Các View/Control tương tự như ở giao diện thêm ca sĩ

\- Xây dựng chức năng tương tự như thêm ca sĩ
# *2.2.2.11 Màn hình thêm Albums*
![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.095.png)

*Hình 29: Giao diện thêm Albums*

\- Chức năng của màn hình này:

\+ Cho phép nhập tên và đường dẫn đến dữ liệu hình ảnh của Albums

\+ Thêm Albumsvào hệ thống

\- Các View/Control tương tự như ở giao diện thêm ca sĩ

\- Xây dựng chức năng tương tự như thêm ca sĩ


# **CHƯƠNG 3: CÀI ĐẶT VÀ ĐÓNG GÓI CHƯƠNG TRÌNH**

# **3.1 Môi trường cài đặt và đóng gói chương trình**
# ***3.1.1 Giới thiệu Java JDK, Android SDK, Android Studio*** 
\- Android SDK (Software Development Kit) và JDK (Java Development Kit) là hai công cụ cần thiết để chúng ta có thể lập trình nên các ứng dụng Android. Và tất nhiên nếu bạn không muốn lập trình trên phần mềm soạn thảo văn bản thì một công cụ lập trình IDE (Integrated development environment) sẽ rất hữu ích và tiện lợi. Eclipse được xem là một công cụ hỗ trợ rất tốt trong việc lập trình ứng dụng Android. 

\- Android SDK, JDK và Eclipse đều có mặt  trên một số phiên bản hệ điều hành Windows, Mac OS và Linux do đó chúng ta có thể lập trình trên hệ điều hành mà chúng ta đã quen sử dụng. Thêm nữa, Android được thực thi trên máy ảo Dalvik nên việc phát triển ứng dụng là như nhau trên cả 3 môi trường. 

\- Android Studio được Google chính thức phát hành phiên bản đầu tiên Android Studio 0.1 vào tháng 5/ 2013 (Phiên bản hiện nay là 1.2.1 – phát hành vào tháng 5/ 2015 và phiên bản 1.3 đã được công bố tại Google I/O 2015). Là công cụ lập trình dựa trên nền 

IntelliJ, cung cấp các tính năng mạnh mẽ hơn ADT như: 

- Hỗ trợ xây dựng dự án dạng Gradle. 
- Hỗ trợ sửa lỗi nhanh và tái sử dụng cấu trúc phương thức. 
- Cung cấp các công cụ kiểm tra tính khả dụng, khả năng họat động của ứng dụng, tương thích nền tảng… 
- Hỗ trợ bảo mật mã nguồn và đóng gói ứng dụng. 
- Trình biên tập giao diện cung cấp tổng quan giao diện ứng dụng và các thành phần, cho phép tuỳ chỉnh trên nhiều cấu hình khác nhau. 
- Cho phép tương tác với nền Google Cloud. 

\- Với mục tiêu tạo ra môi trường phát triển tất cả trong một, trải nghiệm nhanh và mượt hơn các IDE khác, Android Studio không ngừng ra đời các phiên bản cải tiến.  
# ***3.1.2 Thiết lập môi trường phát triển***
\- Như đã nói ở trên, ứng dụng Android được thực thi trên máy ảo Dalvik nên chúng ta có thể lập trình trên nhiều phiên bản của các hệ điều hành. Cụ thể như sau:  

- Microsoft® Windows® 8/7/Vista/2003 (32 or 64-bit). 
- 2 GB RAM trở lên. 
- Dung lượng ổ đĩa ứng còn trống ít nhất 400 MB. 
- Ít nhất 1 GB cho  Android SDK, emulator system images và caches. 
- Độ phân giảm tối thiểu 1280 x 800. 
- Java Development Kit (JDK) 7 trở lên. 
- Tùy chọn thêm cho accelerated emulator: hỗ trợ bộ xử lý Intel® với các phiên bản: Intel® VT-x, Intel® EM64T (Intel® 64), và tính năng Execute Disable (XD) Bit. 

\- Để bắt đầu viết ứng dụng với Android Studio, chúng ta cần tải và cài đặt hai bộ phần mềm sau: o ***Java JDK***: http://java.sun.com/javase/downloads/index.jsp  (Cài đặt trước hết và nên chọn phiên bản mới nhất). 

***Android Studio***: [http://developer.android.com/sdk/index.html](about:blank)[ ](about:blank)- tải gói Android Studio
# **3.2 Đóng gói và chạy chương trình**
# **3.2.1 Tạo và tích hợp FireBase vào project**
\- Truy cập đường dẫn: [https://firebase.google.com/](about:blank)

![C:\Users\black\Desktop\fire1.png](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.096.png)

Ở đây chúng ta nhấn vào truy cập bảng điều khiển

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.097.png)

Tiếp đến chúng ta nhấn create a project

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.098.png)

Nhập tên, chấp nhận điều khoản rồi nhấn Continue

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.099.png)

Nhấn Continue ở bước 2, ở bước 3 chúng ta chọn quốc gia và chấp nhận điều khoản. Sau đó nhấn Create project

![C:\Users\black\Desktop\fire2.png](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.100.png)

Nhấn vào biểu tượng android để nhúng firebase vào app của chúng ta

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.101.png)

Ở đây chúng ta copy tên packge project của chúng ta và nhập tên ứng dụng, sau đó nhấn Register app

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.102.png)

Tiếp theo chúng ta nhấn download google-services.json và copy file tải về dán vào thư mục app của sourecode 

Sau đó quay trở lại và bấm next

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.103.png)

Ở bước này chúng ta copy các dòng màu xanh và dán vào vị trí theo đúng như đường dẫn mà người ta hướng dẫn cho mình và nhấn vào sync now

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.104.png)

Xong thì chúng ta nhấn vào Continue to console

![C:\Users\black\Desktop\fire3.png](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.105.png)

Ở đây chúng ta chọn Build và chọn Realtime Database

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.101.png)

Chọn CreateDatabase

![](Aspose.Words.d41cb018-9cc4-4987-90f7-6e5bb212f2b3.106.png)

Và bắt đầu tạo Cơ sở dữ liệu. Ở đây khi chúng ta nhập giá trị vào value thì máy chủ sẽ tự nhận biết kiểu dữ liệu cho chúng ta


# **KẾT LUẬN**
**1. Kết quả đạt được**

✓Xây dựng và cài đặt thành công ứng dụng nghe nhạc online

✓ Biết sử dụng các tính năng cơ bản của máy chủ FireBase

✓Biết kết nối ứng dụng với máy chủ firebase để lưu trữ dữ liệu

✓ Phát nhạc thành công với các chức năng cơ bản như tự chuyển bài, tua nhanh chậm, xoay ảnh khi phát

**2. Kết quả chưa đạt được**

\- Vẫn còn thiếu sót nhiều chức năng như đánh giá, chia sẻ,…

\- Tuy đã có  thể nghe nhạc bình thường nhưng ứng dụng vẫn còn nhiều bug và chưa hoàn thiện hoàn toàn và thiếu sót. 

**3. Hướng phát triển**

\- Hướng phát triển của ứng dụng là hoàn thiện và bổ sung thêm các tính năng mới:

\- Phát triển thêm nhiều tính năng như đánh giá, chia sẻ, hỗ trợ download

Giao diện bắt mắt hơn.

Một lần nữa, em rất mong Thầy Cô giáo và các bạn có những ý kiến nhận xét, đóng góp nhằm phát triển cho đề tài ngày càng hoàn thiện hơn.


# **TÀI LIỆU THAM KHẢO**

[1]. Phạm Văn Ất - Lê Trường Thông, *Giáo Trình C++ Và Lập Trình Hướng Đối Tượng*, NXB Bách khoa Hà Nội.

[3]. Đoàn Văn Ban, *Lập trình Java nâng cao*, NXB Khoa học kỹ thuật, 2018.

`  `[4]. Lê Hoàng Sơn – Nguyễn Thọ Thông, *Giáo trình lập trình Android*, NXB Xây dựng. 

[5]. *Bài giảng Lập trình di động*, Trần Bình Giang – Khoa CNTT Trường ĐHSP Kỹ thuật Vinh (Tài liệu lưu hành nội bộ).

[6]. Grant Allen, *Beginning Android*, Apress @, 2018.

[7] Marko Gargenta, *Learning Android*, O’reolli, 2011.

[8] Trang Web:

\- [https://www.google.com.vn](about:blank)

`  `-  https://android.vn

5

