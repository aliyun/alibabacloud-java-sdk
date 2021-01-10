// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskSceneNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("SceneNameInfos")
    public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfos> sceneNameInfos;

    public static ListClriskSceneNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskSceneNamesResponseBody self = new ListClriskSceneNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskSceneNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskSceneNamesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskSceneNamesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskSceneNamesResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClriskSceneNamesResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListClriskSceneNamesResponseBody setSceneNameInfos(java.util.List<ListClriskSceneNamesResponseBodySceneNameInfos> sceneNameInfos) {
        this.sceneNameInfos = sceneNameInfos;
        return this;
    }
    public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfos> getSceneNameInfos() {
        return this.sceneNameInfos;
    }

    public static class ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ProductId")
        public Long productId;

        public static ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos self = new ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

    }

    public static class ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("LeafSceneNameInfos")
        public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos> leafSceneNameInfos;

        public static ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos self = new ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos setLeafSceneNameInfos(java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos> leafSceneNameInfos) {
            this.leafSceneNameInfos = leafSceneNameInfos;
            return this;
        }
        public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfosLeafSceneNameInfos> getLeafSceneNameInfos() {
            return this.leafSceneNameInfos;
        }

    }

    public static class ListClriskSceneNamesResponseBodySceneNameInfos extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("SonSceneNameInfos")
        public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos> sonSceneNameInfos;

        public static ListClriskSceneNamesResponseBodySceneNameInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskSceneNamesResponseBodySceneNameInfos self = new ListClriskSceneNamesResponseBodySceneNameInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskSceneNamesResponseBodySceneNameInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskSceneNamesResponseBodySceneNameInfos setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListClriskSceneNamesResponseBodySceneNameInfos setSonSceneNameInfos(java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos> sonSceneNameInfos) {
            this.sonSceneNameInfos = sonSceneNameInfos;
            return this;
        }
        public java.util.List<ListClriskSceneNamesResponseBodySceneNameInfosSonSceneNameInfos> getSonSceneNameInfos() {
            return this.sonSceneNameInfos;
        }

    }

}
