// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceRequest extends TeaModel {
    /**
     * <p>The number of Compute Units (CUs). A CU is a compute core that can be used for parallel processing when Dedicated SQL is running.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>Specifies whether to enable Dedicated SQL for the project by default. If this parameter is set to true, all query and analysis operations in the project, such as alerts and dashboards, use Dedicated SQL.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("useAsDefault")
    public Boolean useAsDefault;

    public static UpdateSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceRequest self = new UpdateSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateSqlInstanceRequest setUseAsDefault(Boolean useAsDefault) {
        this.useAsDefault = useAsDefault;
        return this;
    }
    public Boolean getUseAsDefault() {
        return this.useAsDefault;
    }

}
