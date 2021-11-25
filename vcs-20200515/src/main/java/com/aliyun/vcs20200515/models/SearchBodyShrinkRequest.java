// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchBodyShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("OptionList")
    public String optionListShrink;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    public static SearchBodyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyShrinkRequest self = new SearchBodyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchBodyShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchBodyShrinkRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public SearchBodyShrinkRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public SearchBodyShrinkRequest setOptionListShrink(String optionListShrink) {
        this.optionListShrink = optionListShrink;
        return this;
    }
    public String getOptionListShrink() {
        return this.optionListShrink;
    }

    public SearchBodyShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchBodyShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchBodyShrinkRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

}
