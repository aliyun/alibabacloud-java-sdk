// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduOralCalculationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;height&quot;:3024,&quot;mathsInfo&quot;:[{&quot;pos&quot;:[{&quot;x&quot;:128,&quot;y&quot;:456},{&quot;x&quot;:481,&quot;y&quot;:425},{&quot;x&quot;:479,&quot;y&quot;:526},{&quot;x&quot;:127,&quot;y&quot;:523}],&quot;result&quot;:&quot;right&quot;,&quot;title&quot;:&quot;5 9 - 2 5 = 3 4&quot;}],&quot;orgHeight&quot;:3024,&quot;orgWidth&quot;:2268,&quot;prism_version&quot;:&quot;1.0.9&quot;,&quot;prism_wnum&quot;:0,&quot;prism_wordsInfo&quot;:[],&quot;width&quot;:2268}</p>
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

    public static RecognizeEduOralCalculationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduOralCalculationResponseBody self = new RecognizeEduOralCalculationResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeEduOralCalculationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeEduOralCalculationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeEduOralCalculationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeEduOralCalculationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
