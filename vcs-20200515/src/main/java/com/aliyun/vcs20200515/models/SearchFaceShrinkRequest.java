// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceShrinkRequest extends TeaModel {
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
    public String optionListShrink;

    public static SearchFaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceShrinkRequest self = new SearchFaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaceShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchFaceShrinkRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public SearchFaceShrinkRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public SearchFaceShrinkRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public SearchFaceShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchFaceShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchFaceShrinkRequest setOptionListShrink(String optionListShrink) {
        this.optionListShrink = optionListShrink;
        return this;
    }
    public String getOptionListShrink() {
        return this.optionListShrink;
    }

}
