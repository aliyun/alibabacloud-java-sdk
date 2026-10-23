// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GenerateServiceLastAccessedDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:user/test_user</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <strong>example:</strong>
     * <p>SERVICE_LEVEL</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    public static GenerateServiceLastAccessedDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateServiceLastAccessedDetailsRequest self = new GenerateServiceLastAccessedDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GenerateServiceLastAccessedDetailsRequest setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public GenerateServiceLastAccessedDetailsRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

}
