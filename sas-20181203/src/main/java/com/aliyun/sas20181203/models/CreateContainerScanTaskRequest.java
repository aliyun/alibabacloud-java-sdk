// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/182997.html) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the container.</p>
     */
    @NameInMap("ContainerIds")
    public String containerIds;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static CreateContainerScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerScanTaskRequest self = new CreateContainerScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerScanTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateContainerScanTaskRequest setContainerIds(String containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public String getContainerIds() {
        return this.containerIds;
    }

    public CreateContainerScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
