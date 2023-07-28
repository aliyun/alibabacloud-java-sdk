// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetSecretParametersRequest extends TeaModel {
    /**
     * <p>The name of the encryption parameter. Multiple encryption parameters can form a JSON array in the format of \["xxxxxxxxx", "yyyyyyyyy", … "zzzzzzzzz"]. Each JSON array can contain a maximum of 10 encryption parameters. Multiple encryption parameters in the array are separated by commas (,).</p>
     */
    @NameInMap("Names")
    public String names;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to decrypt the parameter value. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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
