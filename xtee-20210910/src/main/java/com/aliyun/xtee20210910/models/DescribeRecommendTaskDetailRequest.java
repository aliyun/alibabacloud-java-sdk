// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRecommendTaskDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    @NameInMap("taskId")
    public Long taskId;

    public static DescribeRecommendTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendTaskDetailRequest self = new DescribeRecommendTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecommendTaskDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecommendTaskDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeRecommendTaskDetailRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
