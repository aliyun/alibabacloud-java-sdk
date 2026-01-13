// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateCustomerModuleOutputInfoRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    /**
     * <p>Number of decimal places to retain.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("FinalScoreFormat")
    public String finalScoreFormat;

    /**
     * <p>Score processing logic.</p>
     * 
     * <strong>example:</strong>
     * <p>score</p>
     */
    @NameInMap("ProcessExpression")
    public String processExpression;

    /**
     * <p>Test file URL.</p>
     * 
     * <strong>example:</strong>
     * <p>customer/xxxxxxxxx/xxxxxxxx.pmml</p>
     */
    @NameInMap("TestFileUrl")
    public String testFileUrl;

    public static CreateCustomerModuleOutputInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerModuleOutputInfoRequest self = new CreateCustomerModuleOutputInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerModuleOutputInfoRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    public CreateCustomerModuleOutputInfoRequest setFinalScoreFormat(String finalScoreFormat) {
        this.finalScoreFormat = finalScoreFormat;
        return this;
    }
    public String getFinalScoreFormat() {
        return this.finalScoreFormat;
    }

    public CreateCustomerModuleOutputInfoRequest setProcessExpression(String processExpression) {
        this.processExpression = processExpression;
        return this;
    }
    public String getProcessExpression() {
        return this.processExpression;
    }

    public CreateCustomerModuleOutputInfoRequest setTestFileUrl(String testFileUrl) {
        this.testFileUrl = testFileUrl;
        return this;
    }
    public String getTestFileUrl() {
        return this.testFileUrl;
    }

}
