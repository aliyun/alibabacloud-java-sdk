// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>210****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>strategy****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>hash</p>
     */
    @NameInMap("StudyMode")
    public String studyMode;

    public static ListUnknownThreatDetectStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectStrategyRequest self = new ListUnknownThreatDetectStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectStrategyRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListUnknownThreatDetectStrategyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListUnknownThreatDetectStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUnknownThreatDetectStrategyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListUnknownThreatDetectStrategyRequest setStudyMode(String studyMode) {
        this.studyMode = studyMode;
        return this;
    }
    public String getStudyMode() {
        return this.studyMode;
    }

}
