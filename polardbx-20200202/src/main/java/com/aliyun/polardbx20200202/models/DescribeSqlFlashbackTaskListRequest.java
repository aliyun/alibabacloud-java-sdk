// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbackTaskListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**********</p>
     */
    @NameInMap("PolardbxInstanceId")
    public String polardbxInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSqlFlashbackTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbackTaskListRequest self = new DescribeSqlFlashbackTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbackTaskListRequest setPolardbxInstanceId(String polardbxInstanceId) {
        this.polardbxInstanceId = polardbxInstanceId;
        return this;
    }
    public String getPolardbxInstanceId() {
        return this.polardbxInstanceId;
    }

    public DescribeSqlFlashbackTaskListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
