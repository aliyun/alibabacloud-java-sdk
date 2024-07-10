// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigRequest extends TeaModel {
    /**
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>0026ff7f-2b57-4127-bdd0-9bf202bb\<em>\</em>\<em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>0026ff7f-2b57-4127-bdd0-9bf202bb****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static DescribeApplicationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigRequest self = new DescribeApplicationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationConfigRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
