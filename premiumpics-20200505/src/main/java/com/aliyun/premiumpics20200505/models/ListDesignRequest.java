// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListDesignRequest extends TeaModel {
    @NameInMap("DesignType")
    public String designType;

    @NameInMap("DesignVersion")
    public String designVersion;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDesignRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDesignRequest self = new ListDesignRequest();
        return TeaModel.build(map, self);
    }

    public ListDesignRequest setDesignType(String designType) {
        this.designType = designType;
        return this;
    }
    public String getDesignType() {
        return this.designType;
    }

    public ListDesignRequest setDesignVersion(String designVersion) {
        this.designVersion = designVersion;
        return this;
    }
    public String getDesignVersion() {
        return this.designVersion;
    }

    public ListDesignRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ListDesignRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
