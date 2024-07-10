// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRussianResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;Тэбако (коробочка для косметики) с рисунком в виде колес повозки&quot;,&quot;height&quot;:199,&quot;orgHeight&quot;:199,&quot;orgWidth&quot;:766,&quot;prism_version&quot;:&quot;1.0.9&quot;,&quot;prism_wnum&quot;:6,&quot;prism_wordsInfo&quot;:[{&quot;angle&quot;:-89,&quot;direction&quot;:0,&quot;height&quot;:722,&quot;pos&quot;:[{&quot;x&quot;:6,&quot;y&quot;:23},{&quot;x&quot;:728,&quot;y&quot;:26},{&quot;x&quot;:727,&quot;y&quot;:43},{&quot;x&quot;:5,&quot;y&quot;:41}],&quot;prob&quot;:99,&quot;width&quot;:17,&quot;word&quot;:&quot;Тэбако (коробочка для косметики) с рисунком в виде колес повозки， покрытая&quot;,&quot;x&quot;:358,&quot;y&quot;:-327}],&quot;width&quot;:766}</p>
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

    public static RecognizeRussianResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussianResponseBody self = new RecognizeRussianResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeRussianResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeRussianResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeRussianResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeRussianResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
