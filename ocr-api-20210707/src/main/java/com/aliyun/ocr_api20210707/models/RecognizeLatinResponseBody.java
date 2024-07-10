// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeLatinResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;angle&quot;:1,&quot;content&quot;:&quot;Đậm Phong Cách Khác Biêt  Trên tay chế tác nguyên khối dẫn đầu xu hướng với thiết kế thần máy liền mạch, độ mông ấn tượng 8.5mm cùng   kiểu dáng mặt kinh bóng mượt, sang trọng từ Galaxy M30. Vừa vặn hoền hẩo trong lông bần tay, tho thích thể hiện   phong cách thời thượng với hai phiên bản màu Đen hoặc Xanh cắ tính.  xanh Ngân Hà   Đen Ngả Khói  OC S   &quot;,&quot;height&quot;:821,&quot;orgHeight&quot;:803,&quot;orgWidth&quot;:1075,&quot;prism_version&quot;:&quot;1.0.9&quot;,&quot;prism_wnum&quot;:9,&quot;prism_wordsInfo&quot;:[{&quot;angle&quot;:0,&quot;direction&quot;:0,&quot;height&quot;:37,&quot;pos&quot;:[{&quot;x&quot;:293,&quot;y&quot;:37},{&quot;x&quot;:776,&quot;y&quot;:29},{&quot;x&quot;:777,&quot;y&quot;:66},{&quot;x&quot;:294,&quot;y&quot;:74}],&quot;prob&quot;:99,&quot;width&quot;:484,&quot;word&quot;:&quot;Đậm Phong Cách&quot;,&quot;x&quot;:292,&quot;y&quot;:24}],&quot;width&quot;:1088}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeLatinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLatinResponseBody self = new RecognizeLatinResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeLatinResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeLatinResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeLatinResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeLatinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
