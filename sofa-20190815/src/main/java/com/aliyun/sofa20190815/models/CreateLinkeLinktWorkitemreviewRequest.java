// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktWorkitemreviewRequest extends TeaModel {
    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Theme")
    public String theme;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    @NameInMap("ReviewersRepeatList")
    public java.util.List<String> reviewersRepeatList;

    public static CreateLinkeLinktWorkitemreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktWorkitemreviewRequest self = new CreateLinkeLinktWorkitemreviewRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktWorkitemreviewRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public CreateLinkeLinktWorkitemreviewRequest setTheme(String theme) {
        this.theme = theme;
        return this;
    }
    public String getTheme() {
        return this.theme;
    }

    public CreateLinkeLinktWorkitemreviewRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

    public CreateLinkeLinktWorkitemreviewRequest setReviewersRepeatList(java.util.List<String> reviewersRepeatList) {
        this.reviewersRepeatList = reviewersRepeatList;
        return this;
    }
    public java.util.List<String> getReviewersRepeatList() {
        return this.reviewersRepeatList;
    }

}
