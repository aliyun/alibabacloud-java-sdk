// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ExternalStore extends TeaModel {
    /**
     * <p>外部存储名称，在同一Project中名称不能重复，且和Logstore名称不能重复。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_store</p>
     */
    @NameInMap("externalStoreName")
    public String externalStoreName;

    /**
     * <p>外部存储的配置参数。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 		&quot;vpc-id&quot;: &quot;vpc-bp1aevy8sofi8mh1q****&quot;, 		&quot;instance-id&quot;: &quot;i-bp1b6c719dfa08exf****&quot;, 		&quot;host&quot;: &quot;192.168.XX.XX&quot;, 		&quot;port&quot;: &quot;3306&quot;, 		&quot;username&quot;: &quot;root&quot;, 		&quot;password&quot;: &quot;sfdsfldsfksfls****&quot;, 		&quot;db&quot;: &quot;meta&quot;, 		&quot;table&quot;: &quot;join_meta&quot;, 		&quot;region&quot;: &quot;cn-qingdao&quot; 	}</p>
     */
    @NameInMap("parameter")
    public java.util.Map<String, ?> parameter;

    /**
     * <p>存储类型。固定取值为rds-vpc，表示VPC下的RDS MySQL数据库。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds-vpc</p>
     */
    @NameInMap("storeType")
    public String storeType;

    public static ExternalStore build(java.util.Map<String, ?> map) throws Exception {
        ExternalStore self = new ExternalStore();
        return TeaModel.build(map, self);
    }

    public ExternalStore setExternalStoreName(String externalStoreName) {
        this.externalStoreName = externalStoreName;
        return this;
    }
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public ExternalStore setParameter(java.util.Map<String, ?> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, ?> getParameter() {
        return this.parameter;
    }

    public ExternalStore setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
