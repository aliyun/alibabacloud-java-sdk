// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAdvancedResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{ 	&quot;content&quot;: &quot;2017年河北区实验小学&quot;, 	&quot;height&quot;: 3509, 	&quot;orgHeight&quot;: 3509, 	&quot;orgWidth&quot;: 2512, 	&quot;prism_version&quot;: &quot;1.0.9&quot;, 	&quot;prism_wnum&quot;: 126, 	&quot;prism_wordsInfo&quot;: [{ 		&quot;angle&quot;: -89, 		&quot;direction&quot;: 0, 		&quot;height&quot;: 541, 		&quot;pos&quot;: [{ 			&quot;x&quot;: 982, 			&quot;y&quot;: 223 		}, { 			&quot;x&quot;: 1522, 			&quot;y&quot;: 223 		}, { 			&quot;x&quot;: 1522, 			&quot;y&quot;: 266 		}, { 			&quot;x&quot;: 982, 			&quot;y&quot;: 266 		}], 		&quot;prob&quot;: 99, 		&quot;width&quot;: 43, 		&quot;word&quot;: &quot;2017年河北区实验小学&quot;, 		&quot;x&quot;: 1230, 		&quot;y&quot;: -26 	}], 	&quot;width&quot;: 2512 }</p>
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

    public static RecognizeAdvancedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAdvancedResponseBody self = new RecognizeAdvancedResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeAdvancedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeAdvancedResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeAdvancedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeAdvancedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
