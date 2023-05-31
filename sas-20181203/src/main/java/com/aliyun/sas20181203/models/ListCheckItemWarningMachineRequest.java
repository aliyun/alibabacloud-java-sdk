// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningMachineRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The name of the field that is used to query containers.</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that is used to query containers.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~130972~~) operation to query the ID of the asset group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword that is used to query servers in fuzzy match mode.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The type of the check item.</p>
     */
    @NameInMap("RiskType")
    public String riskType;

    /**
     * <p>The status of the check item.</p>
     * <br>
     * <p>> Valid values:</p>
     * <br>
     * <p>*   1: failed</p>
     * <br>
     * <p>*   2: verifying</p>
     * <br>
     * <p>*   3: passed</p>
     * <br>
     * <p>*   6: ignored</p>
     * <br>
     * <p>*   7: fixing</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ListCheckItemWarningMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningMachineRequest self = new ListCheckItemWarningMachineRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningMachineRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListCheckItemWarningMachineRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public ListCheckItemWarningMachineRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public ListCheckItemWarningMachineRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckItemWarningMachineRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListCheckItemWarningMachineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckItemWarningMachineRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckItemWarningMachineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListCheckItemWarningMachineRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public ListCheckItemWarningMachineRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
