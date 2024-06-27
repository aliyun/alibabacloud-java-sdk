// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAnalysisConditionFavoriteListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeAnalysisConditionFavoriteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnalysisConditionFavoriteListRequest self = new DescribeAnalysisConditionFavoriteListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnalysisConditionFavoriteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAnalysisConditionFavoriteListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
