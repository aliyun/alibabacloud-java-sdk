// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CopyProductRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the source product.</p>
     * <blockquote>
     * <p>The source product can belong to the current account or belong to a product portfolio that is shared by another account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:servicecatalog:cn-hangzhou:146611588617****:product/prod-bp18r7q127****</p>
     */
    @NameInMap("SourceProductArn")
    public String sourceProductArn;

    /**
     * <p>The name of the destination product.</p>
     * 
     * <strong>example:</strong>
     * <p>DEMO-ECS</p>
     */
    @NameInMap("TargetProductName")
    public String targetProductName;

    public static CopyProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyProductRequest self = new CopyProductRequest();
        return TeaModel.build(map, self);
    }

    public CopyProductRequest setSourceProductArn(String sourceProductArn) {
        this.sourceProductArn = sourceProductArn;
        return this;
    }
    public String getSourceProductArn() {
        return this.sourceProductArn;
    }

    public CopyProductRequest setTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName;
        return this;
    }
    public String getTargetProductName() {
        return this.targetProductName;
    }

}
