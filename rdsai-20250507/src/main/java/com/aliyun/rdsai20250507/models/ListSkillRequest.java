// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListSkillRequest extends TeaModel {
    /**
     * <p>The languages supported by the skills.</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>zh-TW: Traditional Chinese</li>
     * <li>en-US: English</li>
     * <li>ja-JP: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records to return on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillRequest self = new ListSkillRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListSkillRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
