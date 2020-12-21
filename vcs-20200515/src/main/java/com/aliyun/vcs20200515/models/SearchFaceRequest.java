// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OptionList")
    public java.util.Map<String, ?> optionList;

    public static SearchFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceRequest self = new SearchFaceRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchFaceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public SearchFaceRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public SearchFaceRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public SearchFaceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchFaceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchFaceRequest setOptionList(java.util.Map<String, ?> optionList) {
        this.optionList = optionList;
        return this;
    }
    public java.util.Map<String, ?> getOptionList() {
        return this.optionList;
    }

}
