// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchBodyRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("OptionList")
    public java.util.Map<String, ?> optionList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    public static SearchBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyRequest self = new SearchBodyRequest();
        return TeaModel.build(map, self);
    }

    public SearchBodyRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public SearchBodyRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public SearchBodyRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public SearchBodyRequest setOptionList(java.util.Map<String, ?> optionList) {
        this.optionList = optionList;
        return this;
    }
    public java.util.Map<String, ?> getOptionList() {
        return this.optionList;
    }

    public SearchBodyRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchBodyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchBodyRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

}
