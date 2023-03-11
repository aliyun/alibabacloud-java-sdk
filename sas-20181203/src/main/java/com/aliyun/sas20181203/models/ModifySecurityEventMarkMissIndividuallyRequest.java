// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityEventMarkMissIndividuallyRequest extends TeaModel {
    /**
     * <p>The alert handling rule that you want to delete.</p>
     */
    @NameInMap("DeleteMarkMissParam")
    public String deleteMarkMissParam;

    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The alert handling that you want to add.</p>
     */
    @NameInMap("InsertMarkMissParam")
    public String insertMarkMissParam;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifySecurityEventMarkMissIndividuallyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityEventMarkMissIndividuallyRequest self = new ModifySecurityEventMarkMissIndividuallyRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityEventMarkMissIndividuallyRequest setDeleteMarkMissParam(String deleteMarkMissParam) {
        this.deleteMarkMissParam = deleteMarkMissParam;
        return this;
    }
    public String getDeleteMarkMissParam() {
        return this.deleteMarkMissParam;
    }

    public ModifySecurityEventMarkMissIndividuallyRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifySecurityEventMarkMissIndividuallyRequest setInsertMarkMissParam(String insertMarkMissParam) {
        this.insertMarkMissParam = insertMarkMissParam;
        return this;
    }
    public String getInsertMarkMissParam() {
        return this.insertMarkMissParam;
    }

    public ModifySecurityEventMarkMissIndividuallyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifySecurityEventMarkMissIndividuallyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
