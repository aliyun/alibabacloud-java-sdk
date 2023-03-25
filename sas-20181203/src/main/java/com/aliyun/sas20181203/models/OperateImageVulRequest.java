// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageVulRequest extends TeaModel {
    /**
     * <p>The information about the vulnerability. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   namespace: the namespace of the image</p>
     * <p>*   repoName: the name of the Container Registry repository</p>
     * <p>*   regionId: the region ID</p>
     * <p>*   instanceId: the ID of the Container Registry instance</p>
     * <p>*   repoId: the name of the repository</p>
     * <p>*   tag: the tad added to the image</p>
     * <p>*   digest: the digest of the image</p>
     * <p>*   newTag: the tag added to the image after the vulnerability is fixed</p>
     * <p>*   uuid: the UUID of the image</p>
     * <p>*   ids: the IDs of the vulnerability primary keys</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>If you want to fix the vulnerability, set the value to vul_fix.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of the vulnerability. Set the value to cve.</p>
     */
    @NameInMap("Type")
    public String type;

    public static OperateImageVulRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateImageVulRequest self = new OperateImageVulRequest();
        return TeaModel.build(map, self);
    }

    public OperateImageVulRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public OperateImageVulRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public OperateImageVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
