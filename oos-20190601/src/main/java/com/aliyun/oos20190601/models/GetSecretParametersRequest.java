// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersRequest extends TeaModel {
    /**
     * <p>The name of the encryption parameter. Multiple encryption parameters can form a JSON array in the format of [&quot;xxxxxxxxx&quot;, &quot;yyyyyyyyy&quot;, … &quot;zzzzzzzzz&quot;]. Each JSON array can contain a maximum of 10 encryption parameters. Multiple encryption parameters in the array are separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;secretParameter&quot;,&quot;secretParameter1&quot;]</p>
     */
    @NameInMap("Names")
    public String names;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to decrypt the parameter value. Default value: false. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("WithDecryption")
    public Boolean withDecryption;

    public static GetSecretParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecretParametersRequest self = new GetSecretParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetSecretParametersRequest setNames(String names) {
        this.names = names;
        return this;
    }
    public String getNames() {
        return this.names;
    }

    public GetSecretParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSecretParametersRequest setWithDecryption(Boolean withDecryption) {
        this.withDecryption = withDecryption;
        return this;
    }
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

}
