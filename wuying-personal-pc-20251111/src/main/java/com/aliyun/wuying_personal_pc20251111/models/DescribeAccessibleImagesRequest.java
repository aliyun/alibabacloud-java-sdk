// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeAccessibleImagesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("BizSource")
    public String bizSource;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("DesktopType")
    public String desktopType;

    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribeAccessibleImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleImagesRequest self = new DescribeAccessibleImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleImagesRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeAccessibleImagesRequest setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public DescribeAccessibleImagesRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeAccessibleImagesRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
    }

    public DescribeAccessibleImagesRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public DescribeAccessibleImagesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeAccessibleImagesRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeAccessibleImagesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeAccessibleImagesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
