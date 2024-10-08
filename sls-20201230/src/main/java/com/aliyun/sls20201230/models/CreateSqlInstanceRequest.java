// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateSqlInstanceRequest extends TeaModel {
    /**
     * <p>The number of compute units (CUs). When you use the Dedicated SQL feature, CUs are used in parallel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>Specifies whether to enable the Dedicated SQL feature for the project. If you set this parameter to true, the Dedicated SQL feature is enabled for the specified project and takes effect for all query statements that you execute in the project, including the query statements for alerts and dashboards.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("useAsDefault")
    public Boolean useAsDefault;

    public static CreateSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlInstanceRequest self = new CreateSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public CreateSqlInstanceRequest setUseAsDefault(Boolean useAsDefault) {
        this.useAsDefault = useAsDefault;
        return this;
    }
    public Boolean getUseAsDefault() {
        return this.useAsDefault;
    }

}
