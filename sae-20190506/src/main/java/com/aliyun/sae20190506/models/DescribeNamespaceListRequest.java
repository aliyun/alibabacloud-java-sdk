// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeNamespaceListRequest extends TeaModel {
    /**
     * <p>Specifies whether to return custom namespaces. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system returns custom namespaces.</li>
     * <li><strong>false</strong>: The system does not return custom namespaces.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ContainCustom")
    public Boolean containCustom;

    /**
     * <p>Specifies whether to exclude hybrid cloud namespaces from the result. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system excludes hybrid cloud namespaces from the result.</li>
     * <li><strong>false</strong>: The system does not exclude hybrid cloud namespaces from the result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HybridCloudExclude")
    public Boolean hybridCloudExclude;

    public static DescribeNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespaceListRequest self = new DescribeNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNamespaceListRequest setContainCustom(Boolean containCustom) {
        this.containCustom = containCustom;
        return this;
    }
    public Boolean getContainCustom() {
        return this.containCustom;
    }

    public DescribeNamespaceListRequest setHybridCloudExclude(Boolean hybridCloudExclude) {
        this.hybridCloudExclude = hybridCloudExclude;
        return this;
    }
    public Boolean getHybridCloudExclude() {
        return this.hybridCloudExclude;
    }

}
