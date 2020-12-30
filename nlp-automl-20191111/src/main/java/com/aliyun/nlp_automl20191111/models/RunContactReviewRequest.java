// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class RunContactReviewRequest extends TeaModel {
    @NameInMap("ContactScene")
    public String contactScene;

    @NameInMap("ContactPath")
    public String contactPath;

    @NameInMap("Product")
    public String product;

    public static RunContactReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContactReviewRequest self = new RunContactReviewRequest();
        return TeaModel.build(map, self);
    }

    public RunContactReviewRequest setContactScene(String contactScene) {
        this.contactScene = contactScene;
        return this;
    }
    public String getContactScene() {
        return this.contactScene;
    }

    public RunContactReviewRequest setContactPath(String contactPath) {
        this.contactPath = contactPath;
        return this;
    }
    public String getContactPath() {
        return this.contactPath;
    }

    public RunContactReviewRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
