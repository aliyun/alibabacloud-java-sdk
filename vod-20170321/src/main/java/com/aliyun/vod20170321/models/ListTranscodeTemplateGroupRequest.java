// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTemplateGroupRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("AppId")
    public String appId;

    public static ListTranscodeTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTemplateGroupRequest self = new ListTranscodeTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTemplateGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTranscodeTemplateGroupRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListTranscodeTemplateGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
