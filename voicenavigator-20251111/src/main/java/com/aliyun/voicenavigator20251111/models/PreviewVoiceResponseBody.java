// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class PreviewVoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cab-config-pre.oss-cn-hangzhou.aliyuncs.com/TTSDEMO/05B9FBF3-3681-10FF-9C24-340A93F3A25F.wav?Expires=1774795253&OSSAccessKeyId=STS.NYGg2ejEjYqySx3EsuRutagbd&Signature=L7oa%2F7s%2FeVwBxpkn3SvKfr8uXB0%3D&security-token=CAISzwJ1q6Ft5B2yfSjIr5ryLIjRh5pL7rOSUV6CoXMgXvpYjqLJhjz2IHhMfnlvB%2BgYsfU2m2xR5%2FYclrp6SJtIXleCZtF94oxN9h2gb4fb42Jqag%2B%2F08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0GG3ASmlrFF%2B9mufMb5M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwYPu0vZYrOLroQ%2BfFFjHKMzEetPq%2F7ylPI9ofDamIXxxAarin3kufQeLmrJ4LwneIvBXr5RHd5wa2rbWAEsmLNBEhL2EJMKtT476hcbIAuUI3bC5F%2BkxOHp9i6ErImtRWbLssUUla4R5TGOWbLJWzkTH93xuRqAAapuIRuRt0d2Odr1hsaYukMd42UkNapdTrehzmXeR6lyv1jlLmkAHve9Cbl9N5bO3A96FSlEfjHksQBWG0CEXRm3jLW41bpR00dgnM6gpOj7lRW2z33L0dTtaRw79X3%2BUqz3gv9md5QvoaVi1jnr%2FcFRNxbjl7DI39pdcGlTI2lqIAA%3D">https://cab-config-pre.oss-cn-hangzhou.aliyuncs.com/TTSDEMO/05B9FBF3-3681-10FF-9C24-340A93F3A25F.wav?Expires=1774795253&amp;OSSAccessKeyId=STS.NYGg2ejEjYqySx3EsuRutagbd&amp;Signature=L7oa%2F7s%2FeVwBxpkn3SvKfr8uXB0%3D&amp;security-token=CAISzwJ1q6Ft5B2yfSjIr5ryLIjRh5pL7rOSUV6CoXMgXvpYjqLJhjz2IHhMfnlvB%2BgYsfU2m2xR5%2FYclrp6SJtIXleCZtF94oxN9h2gb4fb42Jqag%2B%2F08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0GG3ASmlrFF%2B9mufMb5M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwYPu0vZYrOLroQ%2BfFFjHKMzEetPq%2F7ylPI9ofDamIXxxAarin3kufQeLmrJ4LwneIvBXr5RHd5wa2rbWAEsmLNBEhL2EJMKtT476hcbIAuUI3bC5F%2BkxOHp9i6ErImtRWbLssUUla4R5TGOWbLJWzkTH93xuRqAAapuIRuRt0d2Odr1hsaYukMd42UkNapdTrehzmXeR6lyv1jlLmkAHve9Cbl9N5bO3A96FSlEfjHksQBWG0CEXRm3jLW41bpR00dgnM6gpOj7lRW2z33L0dTtaRw79X3%2BUqz3gv9md5QvoaVi1jnr%2FcFRNxbjl7DI39pdcGlTI2lqIAA%3D</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PreviewVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewVoiceResponseBody self = new PreviewVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PreviewVoiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PreviewVoiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PreviewVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviewVoiceResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public PreviewVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
