// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyParameterRequest extends TeaModel {
    /**
     * <p>The client request token. You can set this parameter to any unique string.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The parameter type. Valid values:</p>
     * <ul>
     * <li><strong>compute</strong>: compute layer parameters.</li>
     * <li><strong>storage</strong>: storage layer parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("ParamLevel")
    public String paramLevel;

    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>A JSON-formatted string. MapKey specifies the parameter name, and MapValue specifies the parameter value. The modifiable parameters are dynamically added or removed. Call the <a href="https://help.aliyun.com/document_detail/196856.html">DescribeParameterTemplates</a> operation to query the available parameters. You can specify multiple parameters in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CONN_POOL_BLOCK_TIMEOUT&quot;:6000}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterRequest self = new ModifyParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyParameterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyParameterRequest setParamLevel(String paramLevel) {
        this.paramLevel = paramLevel;
        return this;
    }
    public String getParamLevel() {
        return this.paramLevel;
    }

    public ModifyParameterRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyParameterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
