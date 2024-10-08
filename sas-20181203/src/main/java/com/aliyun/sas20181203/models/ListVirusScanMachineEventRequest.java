// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The task ID that is generated by the handling operation.</p>
     * <blockquote>
     * <p> You can call the <a href="~~OperateVirusEvents~~">OperateVirusEvents</a> operation to handle alerts. You can obtain the task ID from the response parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>233886xx</p>
     */
    @NameInMap("OperateTaskId")
    public String operateTaskId;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>a6931624-c43e-4323-9128-a6be6ffdxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListVirusScanMachineEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineEventRequest self = new ListVirusScanMachineEventRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusScanMachineEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListVirusScanMachineEventRequest setOperateTaskId(String operateTaskId) {
        this.operateTaskId = operateTaskId;
        return this;
    }
    public String getOperateTaskId() {
        return this.operateTaskId;
    }

    public ListVirusScanMachineEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVirusScanMachineEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
