// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateContainerScanTaskRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/182997.html">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>c927cf190e886696db53cda0efb57145394ccf0bf9f525353fa5c22a26e4****</p>
     */
    @NameInMap("ContainerIds")
    public String containerIds;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
