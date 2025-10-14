// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeStructureImportTaskInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    public static DescribeStructureImportTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStructureImportTaskInfoRequest self = new DescribeStructureImportTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStructureImportTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeStructureImportTaskInfoRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

}
