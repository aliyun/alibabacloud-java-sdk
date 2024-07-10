// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeThaiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;angle&quot;:0,&quot;content&quot;:&quot;4สัป าR  ๗  เริมเห็นผิวที่เรียบเบียน  วิรีการใช้ LEshop uA&quot;,&quot;height&quot;:887,&quot;orgHeight&quot;:887,&quot;orgWidth&quot;:790,&quot;prism_version&quot;:&quot;1.0.9&quot;,&quot;prism_wnum&quot;:26,&quot;prism_wordsInfo&quot;:[{&quot;angle&quot;:-89,&quot;direction&quot;:0,&quot;height&quot;:210,&quot;pos&quot;:[{&quot;x&quot;:285,&quot;y&quot;:14},{&quot;x&quot;:495,&quot;y&quot;:14},{&quot;x&quot;:495,&quot;y&quot;:63},{&quot;x&quot;:285,&quot;y&quot;:63}],&quot;prob&quot;:85,&quot;width&quot;:48,&quot;word&quot;:&quot;4สัป าR &quot;,&quot;x&quot;:365,&quot;y&quot;:-66}],&quot;width&quot;:790}</p>
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

    public static RecognizeThaiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeThaiResponseBody self = new RecognizeThaiResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeThaiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeThaiResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeThaiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeThaiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
