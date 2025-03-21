// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayRegionStatisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-20</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("MediaRegion")
    public String mediaRegion;

    public static GetDailyPlayRegionStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayRegionStatisRequest self = new GetDailyPlayRegionStatisRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayRegionStatisRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetDailyPlayRegionStatisRequest setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
        return this;
    }
    public String getMediaRegion() {
        return this.mediaRegion;
    }

}
