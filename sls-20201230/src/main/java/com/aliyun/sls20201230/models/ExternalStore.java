// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ExternalStore extends TeaModel {
    /**
     * <p>The name of the external store. The name must be unique in a project and must be different from Logstore names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_store</p>
     */
    @NameInMap("externalStoreName")
    public String externalStoreName;

    /**
     * <p>The parameters that are configured for the external store.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 		&quot;vpc-id&quot;: &quot;vpc-bp1aevy8sofi8mh1q****&quot;, 		&quot;instance-id&quot;: &quot;i-bp1b6c719dfa08exf****&quot;, 		&quot;host&quot;: &quot;192.168.XX.XX&quot;, 		&quot;port&quot;: &quot;3306&quot;, 		&quot;username&quot;: &quot;root&quot;, 		&quot;password&quot;: &quot;sfdsfldsfksfls****&quot;, 		&quot;db&quot;: &quot;meta&quot;, 		&quot;table&quot;: &quot;join_meta&quot;, 		&quot;region&quot;: &quot;cn-qingdao&quot; 	}</p>
     */
    @NameInMap("parameter")
    public java.util.Map<String, ?> parameter;

    /**
     * <p>The storage type. Set the value to rds-vpc, which indicates a database on an ApsaraDB RDS for MySQL instance in a virtual private cloud (VPC).</p>
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
