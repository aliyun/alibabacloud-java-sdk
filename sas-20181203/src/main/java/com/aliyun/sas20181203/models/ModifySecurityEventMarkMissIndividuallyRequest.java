// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityEventMarkMissIndividuallyRequest extends TeaModel {
    /**
     * <p>The alert handling rule that you want to delete.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;loginSourceIp\&quot;,\&quot;operate\&quot;:\&quot;contains\&quot;,\&quot;eventType\&quot;:\&quot;SIL_AI_ALERT\&quot;,\&quot;eventName\&quot;:\&quot;login_common_ip\&quot;,\&quot;fieldValue\&quot;:\&quot;10.12.XX.XX\&quot;,\&quot;uuids\&quot;:\&quot;\&quot;}]</p>
     */
    @NameInMap("DeleteMarkMissParam")
    public String deleteMarkMissParam;

    /**
     * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The alert handling that you want to add.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;field\&quot;:\&quot;location\&quot;,\&quot;operate\&quot;:\&quot;contains\&quot;,\&quot;eventType\&quot;:\&quot;SIL_AI_ALERT\&quot;,\&quot;eventName\&quot;:\&quot;login_common_ip\&quot;,\&quot;fieldValue\&quot;:\&quot;xx\&quot;,\&quot;uuids\&quot;:\&quot;4296ee47-bf19-4fa4-a4a6-6bxxxxxxxxx\&quot;}]</p>
     */
    @NameInMap("InsertMarkMissParam")
    public String insertMarkMissParam;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
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
