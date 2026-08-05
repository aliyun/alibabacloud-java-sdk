// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseS3AccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Access Key of the S3 account.</p>
     * 
     * <strong>example:</strong>
     * <p>accname</p>
     */
    @NameInMap("UserAccAk")
    public String userAccAk;

    /**
     * <p>The policy document of the S3 account.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Allow&quot;,&quot;Action&quot;:[&quot;s3:<em>&quot;],&quot;Resource&quot;:[&quot;</em>&quot;]}]}</p>
     */
    @NameInMap("UserAccPolicy")
    public String userAccPolicy;

    /**
     * <p>The Secret Key of the S3 account (masked).</p>
     * 
     * <strong>example:</strong>
     * <p>password***</p>
     */
    @NameInMap("UserAccSk")
    public String userAccSk;

    public static DescribeLakebaseS3AccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseS3AccountResponseBody self = new DescribeLakebaseS3AccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseS3AccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLakebaseS3AccountResponseBody setUserAccAk(String userAccAk) {
        this.userAccAk = userAccAk;
        return this;
    }
    public String getUserAccAk() {
        return this.userAccAk;
    }

    public DescribeLakebaseS3AccountResponseBody setUserAccPolicy(String userAccPolicy) {
        this.userAccPolicy = userAccPolicy;
        return this;
    }
    public String getUserAccPolicy() {
        return this.userAccPolicy;
    }

    public DescribeLakebaseS3AccountResponseBody setUserAccSk(String userAccSk) {
        this.userAccSk = userAccSk;
        return this;
    }
    public String getUserAccSk() {
        return this.userAccSk;
    }

}
