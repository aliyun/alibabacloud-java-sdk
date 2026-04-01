// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteSecretResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DF4961DD-16F5-5B24-BD4C-0C7788F7ADAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ARN of the credential for the Data API account.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:rds:cn-hangzhou:1335786***:dbInstance/rm-bp1m7l3j63****</p>
     */
    @NameInMap("SecretArn")
    public String secretArn;

    /**
     * <p>The name of the credential.</p>
     * 
     * <strong>example:</strong>
     * <p>Foo</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretResponseBody self = new DeleteSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecretResponseBody setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public DeleteSecretResponseBody setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

    public DeleteSecretResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
