// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMultiLanguageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;PACKING  Shipper/Export   Invoice No &amp; Date  STM TECHNOLOGY INC. 20140730- ST44 &quot;,&quot;height&quot;:1753,&quot;orgHeight&quot;:1753,&quot;orgWidth&quot;:1240,&quot;prism_version&quot;:&quot;1.0.9&quot;,&quot;prism_wnum&quot;:71,&quot;prism_wordsInfo&quot;:[{&quot;angle&quot;:0,&quot;direction&quot;:0,&quot;height&quot;:33,&quot;pos&quot;:[{&quot;x&quot;:348,&quot;y&quot;:137},{&quot;x&quot;:531,&quot;y&quot;:135},{&quot;x&quot;:532,&quot;y&quot;:168},{&quot;x&quot;:348,&quot;y&quot;:170}],&quot;prob&quot;:99,&quot;recClassify&quot;:1,&quot;width&quot;:184,&quot;word&quot;:&quot;PACKING&quot;,&quot;x&quot;:348,&quot;y&quot;:135}],&quot;width&quot;:1240}</p>
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

    public static RecognizeMultiLanguageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMultiLanguageResponseBody self = new RecognizeMultiLanguageResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeMultiLanguageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeMultiLanguageResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeMultiLanguageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeMultiLanguageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
