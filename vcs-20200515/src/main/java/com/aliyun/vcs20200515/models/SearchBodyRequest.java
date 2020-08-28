// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchBodyRequest extends TeaModel {
    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("StartTimeStamp")
    @Validation(required = true)
    public Long startTimeStamp;

    @NameInMap("EndTimeStamp")
    @Validation(required = true)
    public Long endTimeStamp;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("OptionList")
    public java.util.Map<String, ?> optionList;

    public static SearchBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyRequest self = new SearchBodyRequest();
        return TeaModel.build(map, self);
    }

}
