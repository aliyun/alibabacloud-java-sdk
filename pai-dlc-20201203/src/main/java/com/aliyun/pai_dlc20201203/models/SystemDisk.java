// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SystemDisk extends TeaModel {
    /**
     * <p>The system cloud disk type, such as cloud_essd.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The performance level of the ESSD cloud disk, such as PL0 and PL1.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    /**
     * <p>The size of the system cloud disk, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Size")
    public Long size;

    public static SystemDisk build(java.util.Map<String, ?> map) throws Exception {
        SystemDisk self = new SystemDisk();
        return TeaModel.build(map, self);
    }

    public SystemDisk setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public SystemDisk setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public SystemDisk setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
