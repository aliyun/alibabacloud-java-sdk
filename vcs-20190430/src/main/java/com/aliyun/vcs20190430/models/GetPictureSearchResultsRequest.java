// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class GetPictureSearchResultsRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("BeginTime")
    public String beginTime;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PictureContents")
    public String pictureContents;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopNum")
    public Integer topNum;

    @NameInMap("VcsId")
    public String vcsId;

    public static GetPictureSearchResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchResultsRequest self = new GetPictureSearchResultsRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchResultsRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public GetPictureSearchResultsRequest setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public GetPictureSearchResultsRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public GetPictureSearchResultsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetPictureSearchResultsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetPictureSearchResultsRequest setPictureContents(String pictureContents) {
        this.pictureContents = pictureContents;
        return this;
    }
    public String getPictureContents() {
        return this.pictureContents;
    }

    public GetPictureSearchResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetPictureSearchResultsRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public GetPictureSearchResultsRequest setVcsId(String vcsId) {
        this.vcsId = vcsId;
        return this;
    }
    public String getVcsId() {
        return this.vcsId;
    }

}
