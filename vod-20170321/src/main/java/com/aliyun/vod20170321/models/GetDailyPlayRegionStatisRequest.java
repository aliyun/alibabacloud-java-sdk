// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayRegionStatisRequest extends TeaModel {
    /**
     * <p>The playback date, in days. Format: yyyy-MM-dd.</p>
     * <blockquote>
     * <ul>
     * <li>Only daily queries are supported.</li>
     * <li>Only data within the past year can be queried.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-20</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The media asset region ID. Specify this parameter to perform a filtered query for the playback data of all audio and video files in a specified service region. Valid values:</p>
     * <ul>
     * <li>cn-beijing: China (Beijing)</li>
     * <li>cn-shanghai: China (Shanghai)</li>
     * <li>cn-shenzhen: China (Shenzhen)</li>
     * <li>ap-northeast-1: Japan (Tokyo)</li>
     * <li>ap-southeast-1: Singapore</li>
     * <li>ap-southeast-5: Indonesia (Jakarta)</li>
     * <li>eu-central-1: Germany (Frankfurt)</li>
     * </ul>
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
