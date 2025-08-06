// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDailyPlayStatisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaRegion")
    public String mediaRegion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static GetDailyPlayStatisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDailyPlayStatisRequest self = new GetDailyPlayStatisRequest();
        return TeaModel.build(map, self);
    }

    public GetDailyPlayStatisRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetDailyPlayStatisRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetDailyPlayStatisRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetDailyPlayStatisRequest setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
        return this;
    }
    public String getMediaRegion() {
        return this.mediaRegion;
    }

    public GetDailyPlayStatisRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
