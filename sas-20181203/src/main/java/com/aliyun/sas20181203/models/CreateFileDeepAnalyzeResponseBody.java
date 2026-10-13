// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDeepAnalyzeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>FileNotExist</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The analysis result.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;result&quot;: 0,
     *   &quot;file_analysis&quot;: {
     *     &quot;summary&quot;: {
     *       &quot;ai_interpretation&quot;: &quot;The file is a script for the JetBrains PhpStorm stub generation tool, which is a legitimate developer tool. The code uses the PhpParser library to parse PHP source code and generate the PhpStormStubsMap.php mapping file. The engine analysis did not detect any attempts to invoke dangerous functions, external input processing, code obfuscation, or malicious behavior characteristics, and the file is determined to be normal.&quot;
     *     }
     *   }
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The stage description.</p>
     * 
     * <strong>example:</strong>
     * <p>File hash parsed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7F9C0A1-2B3D-4E5F-8A90-123456XXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stage status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateFileDeepAnalyzeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDeepAnalyzeResponseBody self = new CreateFileDeepAnalyzeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileDeepAnalyzeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFileDeepAnalyzeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateFileDeepAnalyzeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFileDeepAnalyzeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFileDeepAnalyzeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
