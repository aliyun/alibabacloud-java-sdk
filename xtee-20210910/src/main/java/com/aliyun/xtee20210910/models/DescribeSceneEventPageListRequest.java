// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneEventPageListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>servicer_code</p>
     */
    @NameInMap("nameOrCode")
    public String nameOrCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeSceneEventPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneEventPageListRequest self = new DescribeSceneEventPageListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneEventPageListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSceneEventPageListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSceneEventPageListRequest setNameOrCode(String nameOrCode) {
        this.nameOrCode = nameOrCode;
        return this;
    }
    public String getNameOrCode() {
        return this.nameOrCode;
    }

    public DescribeSceneEventPageListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSceneEventPageListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
