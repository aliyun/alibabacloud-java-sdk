// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517;

import com.aliyun.tea.*;
import com.aliyun.oss20190517.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public com.aliyun.gateway.spi.Client _client;
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._client = new com.aliyun.gateway.oss.Client();
        this._spi = _client;
        this._endpointRule = "";
    }


    public AbortBucketWormResponse abortBucketWormWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AbortBucketWormResponse());
    }

    public AbortBucketWormResponse abortBucketWorm(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortBucketWormWithOptions(bucket, headers, runtime);
    }

    public AbortMultipartUploadResponse abortMultipartUploadWithOptions(String bucket, String key, AbortMultipartUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AbortMultipartUploadResponse());
    }

    public AbortMultipartUploadResponse abortMultipartUpload(String bucket, String key, AbortMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public AppendObjectResponse appendObjectWithOptions(String bucket, String key, AppendObjectRequest request, AppendObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            query.put("position", request.position);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.cacheControl)) {
            realHeaders.put("Cache-Control", com.aliyun.teautil.Common.toJSONString(headers.cacheControl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentDisposition)) {
            realHeaders.put("Content-Disposition", com.aliyun.teautil.Common.toJSONString(headers.contentDisposition));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentEncoding)) {
            realHeaders.put("Content-Encoding", com.aliyun.teautil.Common.toJSONString(headers.contentEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentMD5)) {
            realHeaders.put("Content-MD5", com.aliyun.teautil.Common.toJSONString(headers.contentMD5));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.expires)) {
            realHeaders.put("Expires", com.aliyun.teautil.Common.toJSONString(headers.expires));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AppendObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?append"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AppendObjectResponse());
    }

    public AppendObjectResponse appendObject(String bucket, String key, AppendObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AppendObjectHeaders headers = new AppendObjectHeaders();
        return this.appendObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public CompleteBucketWormResponse completeBucketWormWithOptions(String bucket, CompleteBucketWormRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wormId)) {
            query.put("wormId", request.wormId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CompleteBucketWormResponse());
    }

    public CompleteBucketWormResponse completeBucketWorm(String bucket, CompleteBucketWormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeBucketWormWithOptions(bucket, request, headers, runtime);
    }

    public CompleteMultipartUploadResponse completeMultipartUploadWithOptions(String bucket, String key, CompleteMultipartUploadRequest request, CompleteMultipartUploadHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.completeAll)) {
            realHeaders.put("x-oss-complete-all", com.aliyun.teautil.Common.toJSONString(headers.completeAll));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CompleteMultipartUploadResponse());
    }

    public CompleteMultipartUploadResponse completeMultipartUpload(String bucket, String key, CompleteMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CompleteMultipartUploadHeaders headers = new CompleteMultipartUploadHeaders();
        return this.completeMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public CopyObjectResponse copyObjectWithOptions(String bucket, String key, CopyObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySource)) {
            realHeaders.put("x-oss-copy-source", com.aliyun.teautil.Common.toJSONString(headers.copySource));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfMatch)) {
            realHeaders.put("x-oss-copy-source-if-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfModifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-modified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfNoneMatch)) {
            realHeaders.put("x-oss-copy-source-if-none-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfUnmodifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-unmodified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metadataDirective)) {
            realHeaders.put("x-oss-metadata-directive", com.aliyun.teautil.Common.toJSONString(headers.metadataDirective));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.taggingDirective)) {
            realHeaders.put("x-oss-tagging-directive", com.aliyun.teautil.Common.toJSONString(headers.taggingDirective));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CopyObjectResponse());
    }

    public CopyObjectResponse copyObject(String bucket, String key) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CopyObjectHeaders headers = new CopyObjectHeaders();
        return this.copyObjectWithOptions(bucket, key, headers, runtime);
    }

    public CreateSelectObjectMetaResponse createSelectObjectMetaWithOptions(String bucket, String key, CreateSelectObjectMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.selectMetaRequest))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSelectObjectMeta"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateSelectObjectMetaResponse());
    }

    public CreateSelectObjectMetaResponse createSelectObjectMeta(String bucket, String key, CreateSelectObjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSelectObjectMetaWithOptions(bucket, key, request, headers, runtime);
    }

    public DeleteBucketResponse deleteBucketWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucket"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketResponse());
    }

    public DeleteBucketResponse deleteBucket(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketCorsResponse deleteBucketCorsWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketCorsResponse());
    }

    public DeleteBucketCorsResponse deleteBucketCors(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketCorsWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketEncryptionResponse deleteBucketEncryptionWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketEncryptionResponse());
    }

    public DeleteBucketEncryptionResponse deleteBucketEncryption(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketEncryptionWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketInventoryResponse deleteBucketInventoryWithOptions(String bucket, DeleteBucketInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketInventoryResponse());
    }

    public DeleteBucketInventoryResponse deleteBucketInventory(String bucket, DeleteBucketInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public DeleteBucketLifecycleResponse deleteBucketLifecycleWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketLifecycleResponse());
    }

    public DeleteBucketLifecycleResponse deleteBucketLifecycle(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketLifecycleWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketLoggingResponse deleteBucketLoggingWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketLoggingResponse());
    }

    public DeleteBucketLoggingResponse deleteBucketLogging(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketLoggingWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketPolicyResponse deleteBucketPolicyWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketPolicyResponse());
    }

    public DeleteBucketPolicyResponse deleteBucketPolicy(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketPolicyWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketReplicationResponse deleteBucketReplicationWithOptions(String bucket, DeleteBucketReplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication&comp=delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketReplicationResponse());
    }

    public DeleteBucketReplicationResponse deleteBucketReplication(String bucket, DeleteBucketReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketReplicationWithOptions(bucket, request, headers, runtime);
    }

    public DeleteBucketTagsResponse deleteBucketTagsWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketTagsResponse());
    }

    public DeleteBucketTagsResponse deleteBucketTags(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketTagsWithOptions(bucket, headers, runtime);
    }

    public DeleteBucketWebsiteResponse deleteBucketWebsiteWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteBucketWebsiteResponse());
    }

    public DeleteBucketWebsiteResponse deleteBucketWebsite(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBucketWebsiteWithOptions(bucket, headers, runtime);
    }

    public DeleteLiveChannelResponse deleteLiveChannelWithOptions(String bucket, String channel, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteLiveChannelResponse());
    }

    public DeleteLiveChannelResponse deleteLiveChannel(String bucket, String channel) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLiveChannelWithOptions(bucket, channel, headers, runtime);
    }

    public DeleteMultipleObjectsResponse deleteMultipleObjectsWithOptions(String bucket, DeleteMultipleObjectsRequest request, DeleteMultipleObjectsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentMd5)) {
            realHeaders.put("content-md5", com.aliyun.teautil.Common.toJSONString(headers.contentMd5));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.delete))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMultipleObjects"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMultipleObjectsResponse());
    }

    public DeleteMultipleObjectsResponse deleteMultipleObjects(String bucket, DeleteMultipleObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteMultipleObjectsHeaders headers = new DeleteMultipleObjectsHeaders();
        return this.deleteMultipleObjectsWithOptions(bucket, request, headers, runtime);
    }

    public DeleteObjectResponse deleteObjectWithOptions(String bucket, String key, DeleteObjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteObjectResponse());
    }

    public DeleteObjectResponse deleteObject(String bucket, String key, DeleteObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public DeleteObjectTaggingResponse deleteObjectTaggingWithOptions(String bucket, String key, DeleteObjectTaggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteObjectTaggingResponse());
    }

    public DeleteObjectTaggingResponse deleteObjectTagging(String bucket, String key, DeleteObjectTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("regions", request.regions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    public ExtendBucketWormResponse extendBucketWormWithOptions(String bucket, ExtendBucketWormRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wormId)) {
            query.put("wormId", request.wormId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExtendBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?wormExtend"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ExtendBucketWormResponse());
    }

    public ExtendBucketWormResponse extendBucketWorm(String bucket, ExtendBucketWormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.extendBucketWormWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketAclResponse getBucketAclWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketAclResponse());
    }

    public GetBucketAclResponse getBucketAcl(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketAclWithOptions(bucket, headers, runtime);
    }

    public GetBucketCorsResponse getBucketCorsWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketCorsResponse());
    }

    public GetBucketCorsResponse getBucketCors(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketCorsWithOptions(bucket, headers, runtime);
    }

    public GetBucketEncryptionResponse getBucketEncryptionWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketEncryptionResponse());
    }

    public GetBucketEncryptionResponse getBucketEncryption(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketEncryptionWithOptions(bucket, headers, runtime);
    }

    public GetBucketInfoResponse getBucketInfoWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketInfo"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?bucketInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketInfoResponse());
    }

    public GetBucketInfoResponse getBucketInfo(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketInfoWithOptions(bucket, headers, runtime);
    }

    public GetBucketInventoryResponse getBucketInventoryWithOptions(String bucket, GetBucketInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketInventoryResponse());
    }

    public GetBucketInventoryResponse getBucketInventory(String bucket, GetBucketInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketLifecycleResponse getBucketLifecycleWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLifecycleResponse());
    }

    public GetBucketLifecycleResponse getBucketLifecycle(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLifecycleWithOptions(bucket, headers, runtime);
    }

    public GetBucketLocationResponse getBucketLocationWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLocation"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?location"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLocationResponse());
    }

    public GetBucketLocationResponse getBucketLocation(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLocationWithOptions(bucket, headers, runtime);
    }

    public GetBucketLoggingResponse getBucketLoggingWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketLoggingResponse());
    }

    public GetBucketLoggingResponse getBucketLogging(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketLoggingWithOptions(bucket, headers, runtime);
    }

    public GetBucketPolicyResponse getBucketPolicyWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketPolicyResponse());
    }

    public GetBucketPolicyResponse getBucketPolicy(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketPolicyWithOptions(bucket, headers, runtime);
    }

    public GetBucketRefererResponse getBucketRefererWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReferer"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?referer"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketRefererResponse());
    }

    public GetBucketRefererResponse getBucketReferer(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketRefererWithOptions(bucket, headers, runtime);
    }

    public GetBucketReplicationResponse getBucketReplicationWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationResponse());
    }

    public GetBucketReplicationResponse getBucketReplication(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationWithOptions(bucket, headers, runtime);
    }

    public GetBucketReplicationLocationResponse getBucketReplicationLocationWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplicationLocation"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replicationLocation"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationLocationResponse());
    }

    public GetBucketReplicationLocationResponse getBucketReplicationLocation(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationLocationWithOptions(bucket, headers, runtime);
    }

    public GetBucketReplicationProgressResponse getBucketReplicationProgressWithOptions(String bucket, GetBucketReplicationProgressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("rule-id", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketReplicationProgress"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replicationProgress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketReplicationProgressResponse());
    }

    public GetBucketReplicationProgressResponse getBucketReplicationProgress(String bucket, GetBucketReplicationProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketReplicationProgressWithOptions(bucket, request, headers, runtime);
    }

    public GetBucketRequestPaymentResponse getBucketRequestPaymentWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketRequestPayment"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?requestPayment"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketRequestPaymentResponse());
    }

    public GetBucketRequestPaymentResponse getBucketRequestPayment(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketRequestPaymentWithOptions(bucket, headers, runtime);
    }

    public GetBucketTagsResponse getBucketTagsWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketTagsResponse());
    }

    public GetBucketTagsResponse getBucketTags(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketTagsWithOptions(bucket, headers, runtime);
    }

    public GetBucketTransferAccelerationResponse getBucketTransferAccelerationWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketTransferAcceleration"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?transferAcceleration"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketTransferAccelerationResponse());
    }

    public GetBucketTransferAccelerationResponse getBucketTransferAcceleration(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketTransferAccelerationWithOptions(bucket, headers, runtime);
    }

    public GetBucketVersioningResponse getBucketVersioningWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketVersioning"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versioning"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketVersioningResponse());
    }

    public GetBucketVersioningResponse getBucketVersioning(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketVersioningWithOptions(bucket, headers, runtime);
    }

    public GetBucketWebsiteResponse getBucketWebsiteWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketWebsiteResponse());
    }

    public GetBucketWebsiteResponse getBucketWebsite(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketWebsiteWithOptions(bucket, headers, runtime);
    }

    public GetBucketWormResponse getBucketWormWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetBucketWormResponse());
    }

    public GetBucketWormResponse getBucketWorm(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBucketWormWithOptions(bucket, headers, runtime);
    }

    public GetLiveChannelHistoryResponse getLiveChannelHistoryWithOptions(String bucket, String channel, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelHistory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live&comp=history"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelHistoryResponse());
    }

    public GetLiveChannelHistoryResponse getLiveChannelHistory(String bucket, String channel) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelHistoryWithOptions(bucket, channel, headers, runtime);
    }

    public GetLiveChannelInfoResponse getLiveChannelInfoWithOptions(String bucket, String channel, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelInfo"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelInfoResponse());
    }

    public GetLiveChannelInfoResponse getLiveChannelInfo(String bucket, String channel) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelInfoWithOptions(bucket, channel, headers, runtime);
    }

    public GetLiveChannelStatResponse getLiveChannelStatWithOptions(String bucket, String channel, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLiveChannelStat"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live&comp=stat"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLiveChannelStatResponse());
    }

    public GetLiveChannelStatResponse getLiveChannelStat(String bucket, String channel) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLiveChannelStatWithOptions(bucket, channel, headers, runtime);
    }

    /**
      * **Usage notes**
      * - By default, the GetObject operation supports access over HTTP and HTTPS. To impose a limit on access to a bucket only over HTTPS, configure a bucket policy for the bucket to specify the access method. For more information, see [Configure bucket policies to authorize other users to access OSS resources](~~85111~~).
      * - If the storage class of the object that you want to query is Archive, you must send a RestoreObject request to restore the object before you call the GetObject operation.
      * **Versioning**
      * By default, only the current version of an object is returned after GetObject is called. 
      * If the version ID of the object is specified in the request, OSS returns the specified version of the object. If the version ID is set to null in the request, OSS returns the version of the object whose version ID is null.
      *
      * @param request GetObjectRequest
      * @param headers GetObjectHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetObjectResponse
     */
    public GetObjectResponse getObjectWithOptions(String bucket, String key, GetObjectRequest request, GetObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.responseCacheControl)) {
            query.put("response-cache-control", request.responseCacheControl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentDisposition)) {
            query.put("response-content-disposition", request.responseContentDisposition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentEncoding)) {
            query.put("response-content-encoding", request.responseContentEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentLanguage)) {
            query.put("response-content-language", request.responseContentLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentType)) {
            query.put("response-content-type", request.responseContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseExpires)) {
            query.put("response-expires", request.responseExpires);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("Accept-Encoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifModifiedSince)) {
            realHeaders.put("If-Modified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifNoneMatch)) {
            realHeaders.put("If-None-Match", com.aliyun.teautil.Common.toJSONString(headers.ifNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifUnmodifiedSince)) {
            realHeaders.put("If-Unmodified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.range)) {
            realHeaders.put("Range", com.aliyun.teautil.Common.toJSONString(headers.range));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectResponse());
    }

    /**
      * **Usage notes**
      * - By default, the GetObject operation supports access over HTTP and HTTPS. To impose a limit on access to a bucket only over HTTPS, configure a bucket policy for the bucket to specify the access method. For more information, see [Configure bucket policies to authorize other users to access OSS resources](~~85111~~).
      * - If the storage class of the object that you want to query is Archive, you must send a RestoreObject request to restore the object before you call the GetObject operation.
      * **Versioning**
      * By default, only the current version of an object is returned after GetObject is called. 
      * If the version ID of the object is specified in the request, OSS returns the specified version of the object. If the version ID is set to null in the request, OSS returns the version of the object whose version ID is null.
      *
      * @param request GetObjectRequest
      * @return GetObjectResponse
     */
    public GetObjectResponse getObject(String bucket, String key, GetObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetObjectHeaders headers = new GetObjectHeaders();
        return this.getObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectAclResponse getObjectAclWithOptions(String bucket, String key, GetObjectAclRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?acl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectAclResponse());
    }

    public GetObjectAclResponse getObjectAcl(String bucket, String key, GetObjectAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectAclWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectMetaResponse getObjectMetaWithOptions(String bucket, String key, GetObjectMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectMeta"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?objectMeta"),
            new TeaPair("method", "HEAD"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectMetaResponse());
    }

    public GetObjectMetaResponse getObjectMeta(String bucket, String key, GetObjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectMetaWithOptions(bucket, key, request, headers, runtime);
    }

    public GetObjectTaggingResponse getObjectTaggingWithOptions(String bucket, String key, GetObjectTaggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetObjectTaggingResponse());
    }

    public GetObjectTaggingResponse getObjectTagging(String bucket, String key, GetObjectTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public GetSymlinkResponse getSymlinkWithOptions(String bucket, String key, GetSymlinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSymlink"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?symlink"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSymlinkResponse());
    }

    public GetSymlinkResponse getSymlink(String bucket, String key, GetSymlinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSymlinkWithOptions(bucket, key, request, headers, runtime);
    }

    public GetVodPlaylistResponse getVodPlaylistWithOptions(String bucket, String channel, GetVodPlaylistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVodPlaylist"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?vod"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVodPlaylistResponse());
    }

    public GetVodPlaylistResponse getVodPlaylist(String bucket, String channel, GetVodPlaylistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVodPlaylistWithOptions(bucket, channel, request, headers, runtime);
    }

    /**
      * - When you call this operation, the object content is not returned in the results. 
      * - By default, you can call the HeadObject operation to query the metadata of the object of the current version. If the current version of the object is a delete marker, OSS returns 404 Not Found. If you specify a version ID in the request, OSS returns the metadata of the object of the specified version.
      *
      * @param request HeadObjectRequest
      * @param headers HeadObjectHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return HeadObjectResponse
     */
    public HeadObjectResponse headObjectWithOptions(String bucket, String key, HeadObjectRequest request, HeadObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifMatch)) {
            realHeaders.put("If-Match", com.aliyun.teautil.Common.toJSONString(headers.ifMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifModifiedSince)) {
            realHeaders.put("If-Modified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifNoneMatch)) {
            realHeaders.put("If-None-Match", com.aliyun.teautil.Common.toJSONString(headers.ifNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.ifUnmodifiedSince)) {
            realHeaders.put("If-Unmodified-Since", com.aliyun.teautil.Common.toJSONString(headers.ifUnmodifiedSince));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HeadObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "HEAD"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new HeadObjectResponse());
    }

    /**
      * - When you call this operation, the object content is not returned in the results. 
      * - By default, you can call the HeadObject operation to query the metadata of the object of the current version. If the current version of the object is a delete marker, OSS returns 404 Not Found. If you specify a version ID in the request, OSS returns the metadata of the object of the specified version.
      *
      * @param request HeadObjectRequest
      * @return HeadObjectResponse
     */
    public HeadObjectResponse headObject(String bucket, String key, HeadObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HeadObjectHeaders headers = new HeadObjectHeaders();
        return this.headObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public InitiateBucketWormResponse initiateBucketWormWithOptions(String bucket, InitiateBucketWormRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.initiateWormConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitiateBucketWorm"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?worm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InitiateBucketWormResponse());
    }

    public InitiateBucketWormResponse initiateBucketWorm(String bucket, InitiateBucketWormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initiateBucketWormWithOptions(bucket, request, headers, runtime);
    }

    /**
      * - When you call the InitiateMultipartUpload operation, OSS creates and returns a unique upload ID to identify the multipart upload task. You can initiate operations such as stopping or querying the multipart upload task by using this upload ID.
      * - When you initiate a multipart upload request to upload an object, the existing object that has the same name is not affected.
      * - If you want to calculate the signature for authentication when you call this operation, you must add `?uploads` to `CanonicalizedResource`.
      *
      * @param request InitiateMultipartUploadRequest
      * @param headers InitiateMultipartUploadHeaders
      * @param runtime runtime options for this request RuntimeOptions
      * @return InitiateMultipartUploadResponse
     */
    public InitiateMultipartUploadResponse initiateMultipartUploadWithOptions(String bucket, String key, InitiateMultipartUploadRequest request, InitiateMultipartUploadHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.cacheControl)) {
            realHeaders.put("Cache-Control", com.aliyun.teautil.Common.toJSONString(headers.cacheControl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentDisposition)) {
            realHeaders.put("Content-Disposition", com.aliyun.teautil.Common.toJSONString(headers.contentDisposition));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentEncoding)) {
            realHeaders.put("Content-Encoding", com.aliyun.teautil.Common.toJSONString(headers.contentEncoding));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.expires)) {
            realHeaders.put("Expires", com.aliyun.teautil.Common.toJSONString(headers.expires));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseDataEncryption)) {
            realHeaders.put("x-oss-server-side-data-encryption", com.aliyun.teautil.Common.toJSONString(headers.sseDataEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitiateMultipartUpload"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?uploads"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InitiateMultipartUploadResponse());
    }

    /**
      * - When you call the InitiateMultipartUpload operation, OSS creates and returns a unique upload ID to identify the multipart upload task. You can initiate operations such as stopping or querying the multipart upload task by using this upload ID.
      * - When you initiate a multipart upload request to upload an object, the existing object that has the same name is not affected.
      * - If you want to calculate the signature for authentication when you call this operation, you must add `?uploads` to `CanonicalizedResource`.
      *
      * @param request InitiateMultipartUploadRequest
      * @return InitiateMultipartUploadResponse
     */
    public InitiateMultipartUploadResponse initiateMultipartUpload(String bucket, String key, InitiateMultipartUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InitiateMultipartUploadHeaders headers = new InitiateMultipartUploadHeaders();
        return this.initiateMultipartUploadWithOptions(bucket, key, request, headers, runtime);
    }

    public ListBucketInventoryResponse listBucketInventoryWithOptions(String bucket, ListBucketInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continuationToken)) {
            query.put("continuation-token", request.continuationToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListBucketInventoryResponse());
    }

    public ListBucketInventoryResponse listBucketInventory(String bucket, ListBucketInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public ListBucketsResponse listBucketsWithOptions(ListBucketsRequest request, ListBucketsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOssResourceGroupId)) {
            realHeaders.put("x-oss-resource-group-id", com.aliyun.teautil.Common.toJSONString(headers.xOssResourceGroupId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBuckets"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListBucketsResponse());
    }

    public ListBucketsResponse listBuckets(ListBucketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListBucketsHeaders headers = new ListBucketsHeaders();
        return this.listBucketsWithOptions(request, headers, runtime);
    }

    public ListLiveChannelResponse listLiveChannelWithOptions(String bucket, ListLiveChannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?live"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListLiveChannelResponse());
    }

    public ListLiveChannelResponse listLiveChannel(String bucket, ListLiveChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLiveChannelWithOptions(bucket, request, headers, runtime);
    }

    public ListMultipartUploadsResponse listMultipartUploadsWithOptions(String bucket, ListMultipartUploadsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyMarker)) {
            query.put("key-marker", request.keyMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxUploads)) {
            query.put("max-uploads", request.maxUploads);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadIdMarker)) {
            query.put("upload-id-marker", request.uploadIdMarker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMultipartUploads"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?uploads"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMultipartUploadsResponse());
    }

    public ListMultipartUploadsResponse listMultipartUploads(String bucket, ListMultipartUploadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMultipartUploadsWithOptions(bucket, request, headers, runtime);
    }

    public ListObjectVersionsResponse listObjectVersionsWithOptions(String bucket, ListObjectVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyMarker)) {
            query.put("key-marker", request.keyMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionIdMarker)) {
            query.put("version-id-marker", request.versionIdMarker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjectVersions"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectVersionsResponse());
    }

    public ListObjectVersionsResponse listObjectVersions(String bucket, ListObjectVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectVersionsWithOptions(bucket, request, headers, runtime);
    }

    public ListObjectsResponse listObjectsWithOptions(String bucket, ListObjectsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjects"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectsResponse());
    }

    public ListObjectsResponse listObjects(String bucket, ListObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectsWithOptions(bucket, request, headers, runtime);
    }

    public ListObjectsV2Response listObjectsV2WithOptions(String bucket, ListObjectsV2Request request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continuationToken)) {
            query.put("continuation-token", request.continuationToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delimiter)) {
            query.put("delimiter", request.delimiter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("encoding-type", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchOwner)) {
            query.put("fetch-owner", request.fetchOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("max-keys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAfter)) {
            query.put("start-after", request.startAfter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjectsV2"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?list-type=2"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListObjectsV2Response());
    }

    public ListObjectsV2Response listObjectsV2(String bucket, ListObjectsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listObjectsV2WithOptions(bucket, request, headers, runtime);
    }

    public ListPartsResponse listPartsWithOptions(String bucket, String key, ListPartsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        ListPartsShrinkRequest request = new ListPartsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encodingType)) {
            request.encodingTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encodingType, "encoding-type", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodingTypeShrink)) {
            query.put("encoding-type", request.encodingTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxParts)) {
            query.put("max-parts", request.maxParts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partNumberMarker)) {
            query.put("part-number-marker", request.partNumberMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParts"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListPartsResponse());
    }

    public ListPartsResponse listParts(String bucket, String key, ListPartsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartsWithOptions(bucket, key, request, headers, runtime);
    }

    public OptionObjectResponse optionObjectWithOptions(String bucket, String key, OptionObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accessControlRequestHeaders)) {
            realHeaders.put("Access-Control-Request-Headers", com.aliyun.teautil.Common.toJSONString(headers.accessControlRequestHeaders));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accessControlRequestMethod)) {
            realHeaders.put("Access-Control-Request-Method", com.aliyun.teautil.Common.toJSONString(headers.accessControlRequestMethod));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.origin)) {
            realHeaders.put("Origin", com.aliyun.teautil.Common.toJSONString(headers.origin));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OptionObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "OPTIONS"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OptionObjectResponse());
    }

    public OptionObjectResponse optionObject(String bucket, String key) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OptionObjectHeaders headers = new OptionObjectHeaders();
        return this.optionObjectWithOptions(bucket, key, headers, runtime);
    }

    /**
      * - 
      *   The object that is uploaded by calling the PostObject operation cannot be
      *   larger than 5 GB in size.
      * - 
      *   To initiate a PostObject request to a bucket, you must have write permissions
      *   on the bucket. If the ACL of the bucket to which you want to initiate a
      *   PostObject request is public-read-write, you do not need to sign the
      *   PostObject request. In other cases, Object Storage Service (OSS) verifies the
      *   signature information contained in the request.
      * - 
      *   Unlike the PutObject operation, the PostObject operation uses an AccessKey
      *   secret to calculate the signature for the policy form field. The calculated
      *   signature string is used as the value of the Signature form field. OSS checks
      *   this value to verify the validity of the signature.
      * - 
      *   The URL of the submitted form is the domain name of the bucket. You do not
      *   need to specify the object that you want to upload in the URL. In other words,
      *   the request line is in the format of `POST T/ HTTP/1.1` instead of `POST
      *   /ObjectName HTTP/1.1`.
      * - 
      *   OSS does not check the signature information that is contained in headers or
      *   URLs in PostObject requests.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return PostObjectResponse
     */
    public PostObjectResponse postObjectWithOptions(String bucket, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "multiFormData"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PostObjectResponse());
    }

    /**
      * - 
      *   The object that is uploaded by calling the PostObject operation cannot be
      *   larger than 5 GB in size.
      * - 
      *   To initiate a PostObject request to a bucket, you must have write permissions
      *   on the bucket. If the ACL of the bucket to which you want to initiate a
      *   PostObject request is public-read-write, you do not need to sign the
      *   PostObject request. In other cases, Object Storage Service (OSS) verifies the
      *   signature information contained in the request.
      * - 
      *   Unlike the PutObject operation, the PostObject operation uses an AccessKey
      *   secret to calculate the signature for the policy form field. The calculated
      *   signature string is used as the value of the Signature form field. OSS checks
      *   this value to verify the validity of the signature.
      * - 
      *   The URL of the submitted form is the domain name of the bucket. You do not
      *   need to specify the object that you want to upload in the URL. In other words,
      *   the request line is in the format of `POST T/ HTTP/1.1` instead of `POST
      *   /ObjectName HTTP/1.1`.
      * - 
      *   OSS does not check the signature information that is contained in headers or
      *   URLs in PostObject requests.
      *
      * @return PostObjectResponse
     */
    public PostObjectResponse postObject(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postObjectWithOptions(bucket, headers, runtime);
    }

    public PostVodPlaylistResponse postVodPlaylistWithOptions(String bucket, String channel, String playlist, PostVodPlaylistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("startTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PostVodPlaylist"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "/" + playlist + "?vod"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PostVodPlaylistResponse());
    }

    public PostVodPlaylistResponse postVodPlaylist(String bucket, String channel, String playlist, PostVodPlaylistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.postVodPlaylistWithOptions(bucket, channel, playlist, request, headers, runtime);
    }

    public PutBucketResponse putBucketWithOptions(String bucket, PutBucketRequest request, PutBucketHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOssResourceGroupId)) {
            realHeaders.put("x-oss-resource-group-id", com.aliyun.teautil.Common.toJSONString(headers.xOssResourceGroupId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.createBucketConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucket"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketResponse());
    }

    public PutBucketResponse putBucket(String bucket, PutBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutBucketHeaders headers = new PutBucketHeaders();
        return this.putBucketWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketAclResponse putBucketAclWithOptions(String bucket, PutBucketAclHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketAclResponse());
    }

    public PutBucketAclResponse putBucketAcl(String bucket) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutBucketAclHeaders headers = new PutBucketAclHeaders();
        return this.putBucketAclWithOptions(bucket, headers, runtime);
    }

    public PutBucketCorsResponse putBucketCorsWithOptions(String bucket, PutBucketCorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.cORSConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketCors"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?cors"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketCorsResponse());
    }

    public PutBucketCorsResponse putBucketCors(String bucket, PutBucketCorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketCorsWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketEncryptionResponse putBucketEncryptionWithOptions(String bucket, PutBucketEncryptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.serverSideEncryptionRule))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketEncryption"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?encryption"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketEncryptionResponse());
    }

    public PutBucketEncryptionResponse putBucketEncryption(String bucket, PutBucketEncryptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketEncryptionWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketInventoryResponse putBucketInventoryWithOptions(String bucket, PutBucketInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryId)) {
            query.put("inventoryId", request.inventoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.inventoryConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketInventory"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?inventory"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketInventoryResponse());
    }

    public PutBucketInventoryResponse putBucketInventory(String bucket, PutBucketInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketInventoryWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketLifecycleResponse putBucketLifecycleWithOptions(String bucket, PutBucketLifecycleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.lifecycleConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketLifecycle"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?lifecycle"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketLifecycleResponse());
    }

    public PutBucketLifecycleResponse putBucketLifecycle(String bucket, PutBucketLifecycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketLifecycleWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketLoggingResponse putBucketLoggingWithOptions(String bucket, PutBucketLoggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.bucketLoggingStatus))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketLogging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?logging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketLoggingResponse());
    }

    public PutBucketLoggingResponse putBucketLogging(String bucket, PutBucketLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketLoggingWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketPolicyResponse putBucketPolicyWithOptions(String bucket, PutBucketPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", request.policy)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketPolicy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?policy"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketPolicyResponse());
    }

    public PutBucketPolicyResponse putBucketPolicy(String bucket, PutBucketPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketPolicyWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketRefererResponse putBucketRefererWithOptions(String bucket, PutBucketRefererRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.refererConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketReferer"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?referer"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketRefererResponse());
    }

    public PutBucketRefererResponse putBucketReferer(String bucket, PutBucketRefererRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketRefererWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketReplicationResponse putBucketReplicationWithOptions(String bucket, PutBucketReplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.replicationConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketReplication"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?replication&comp=add"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketReplicationResponse());
    }

    public PutBucketReplicationResponse putBucketReplication(String bucket, PutBucketReplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketReplicationWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketRequestPaymentResponse putBucketRequestPaymentWithOptions(String bucket, PutBucketRequestPaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.requestPaymentConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketRequestPayment"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?requestPayment"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketRequestPaymentResponse());
    }

    public PutBucketRequestPaymentResponse putBucketRequestPayment(String bucket, PutBucketRequestPaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketRequestPaymentWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketTagsResponse putBucketTagsWithOptions(String bucket, PutBucketTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.tagging))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketTags"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?tagging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketTagsResponse());
    }

    public PutBucketTagsResponse putBucketTags(String bucket, PutBucketTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketTagsWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketTransferAccelerationResponse putBucketTransferAccelerationWithOptions(String bucket, PutBucketTransferAccelerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.transferAccelerationConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketTransferAcceleration"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?transferAcceleration"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketTransferAccelerationResponse());
    }

    public PutBucketTransferAccelerationResponse putBucketTransferAcceleration(String bucket, PutBucketTransferAccelerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketTransferAccelerationWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketVersioningResponse putBucketVersioningWithOptions(String bucket, PutBucketVersioningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.versioningConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketVersioning"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?versioning"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketVersioningResponse());
    }

    public PutBucketVersioningResponse putBucketVersioning(String bucket, PutBucketVersioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketVersioningWithOptions(bucket, request, headers, runtime);
    }

    public PutBucketWebsiteResponse putBucketWebsiteWithOptions(String bucket, PutBucketWebsiteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.websiteConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketWebsite"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/?website"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutBucketWebsiteResponse());
    }

    public PutBucketWebsiteResponse putBucketWebsite(String bucket, PutBucketWebsiteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putBucketWebsiteWithOptions(bucket, request, headers, runtime);
    }

    public PutLiveChannelResponse putLiveChannelWithOptions(String bucket, String channel, PutLiveChannelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.liveChannelConfiguration))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLiveChannel"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLiveChannelResponse());
    }

    public PutLiveChannelResponse putLiveChannel(String bucket, String channel, PutLiveChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLiveChannelWithOptions(bucket, channel, request, headers, runtime);
    }

    public PutLiveChannelStatusResponse putLiveChannelStatusWithOptions(String bucket, String channel, PutLiveChannelStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLiveChannelStatus"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + channel + "?live"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLiveChannelStatusResponse());
    }

    public PutLiveChannelStatusResponse putLiveChannelStatus(String bucket, String channel, PutLiveChannelStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLiveChannelStatusWithOptions(bucket, channel, request, headers, runtime);
    }

    public PutObjectResponse putObjectWithOptions(String bucket, String key, PutObjectRequest request, PutObjectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.metaData)) {
            realHeaders.put("x-oss-meta-*", com.aliyun.teautil.Common.toJSONString(headers.metaData));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseDataEncryption)) {
            realHeaders.put("x-oss-server-side-data-encryption", com.aliyun.teautil.Common.toJSONString(headers.sseDataEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.serverSideEncryption)) {
            realHeaders.put("x-oss-server-side-encryption", com.aliyun.teautil.Common.toJSONString(headers.serverSideEncryption));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.sseKeyId)) {
            realHeaders.put("x-oss-server-side-encryption-key-id", com.aliyun.teautil.Common.toJSONString(headers.sseKeyId));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.tagging)) {
            realHeaders.put("x-oss-tagging", com.aliyun.teautil.Common.toJSONString(headers.tagging));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectResponse());
    }

    public PutObjectResponse putObject(String bucket, String key, PutObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutObjectHeaders headers = new PutObjectHeaders();
        return this.putObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public PutObjectAclResponse putObjectAclWithOptions(String bucket, String key, PutObjectAclRequest request, PutObjectAclHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObjectAcl"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?acl"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectAclResponse());
    }

    public PutObjectAclResponse putObjectAcl(String bucket, String key, PutObjectAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutObjectAclHeaders headers = new PutObjectAclHeaders();
        return this.putObjectAclWithOptions(bucket, key, request, headers, runtime);
    }

    public PutObjectTaggingResponse putObjectTaggingWithOptions(String bucket, String key, PutObjectTaggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.tagging))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutObjectTagging"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?tagging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutObjectTaggingResponse());
    }

    public PutObjectTaggingResponse putObjectTagging(String bucket, String key, PutObjectTaggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putObjectTaggingWithOptions(bucket, key, request, headers, runtime);
    }

    public PutSymlinkResponse putSymlinkWithOptions(String bucket, String key, PutSymlinkHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.forbidOverwrite)) {
            realHeaders.put("x-oss-forbid-overwrite", com.aliyun.teautil.Common.toJSONString(headers.forbidOverwrite));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acl)) {
            realHeaders.put("x-oss-object-acl", com.aliyun.teautil.Common.toJSONString(headers.acl));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.storageClass)) {
            realHeaders.put("x-oss-storage-class", com.aliyun.teautil.Common.toJSONString(headers.storageClass));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.symlinkTargetKey)) {
            realHeaders.put("x-oss-symlink-target", com.aliyun.teautil.Common.toJSONString(headers.symlinkTargetKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutSymlink"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?symlink"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutSymlinkResponse());
    }

    public PutSymlinkResponse putSymlink(String bucket, String key) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutSymlinkHeaders headers = new PutSymlinkHeaders();
        return this.putSymlinkWithOptions(bucket, key, headers, runtime);
    }

    public RestoreObjectResponse restoreObjectWithOptions(String bucket, String key, RestoreObjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("versionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.restoreRequest))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + "?restore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RestoreObjectResponse());
    }

    public RestoreObjectResponse restoreObject(String bucket, String key, RestoreObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public SelectObjectResponse selectObjectWithOptions(String bucket, String key, SelectObjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.selectRequest))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectObject"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SelectObjectResponse());
    }

    public SelectObjectResponse selectObject(String bucket, String key, SelectObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectObjectWithOptions(bucket, key, request, headers, runtime);
    }

    public UploadPartResponse uploadPartWithOptions(String bucket, String key, UploadPartRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partNumber)) {
            query.put("partNumber", request.partNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPart"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "binary"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UploadPartResponse());
    }

    public UploadPartResponse uploadPart(String bucket, String key, UploadPartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadPartWithOptions(bucket, key, request, headers, runtime);
    }

    public UploadPartCopyResponse uploadPartCopyWithOptions(String bucket, String key, UploadPartCopyRequest request, UploadPartCopyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("bucket", bucket);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.partNumber)) {
            query.put("partNumber", request.partNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("uploadId", request.uploadId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySource)) {
            realHeaders.put("x-oss-copy-source", com.aliyun.teautil.Common.toJSONString(headers.copySource));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfMatch)) {
            realHeaders.put("x-oss-copy-source-if-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfModifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-modified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfModifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfNoneMatch)) {
            realHeaders.put("x-oss-copy-source-if-none-match", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfNoneMatch));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceIfUnmodifiedSince)) {
            realHeaders.put("x-oss-copy-source-if-unmodified-since", com.aliyun.teautil.Common.toJSONString(headers.copySourceIfUnmodifiedSince));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.copySourceRange)) {
            realHeaders.put("x-oss-copy-source-range", com.aliyun.teautil.Common.toJSONString(headers.copySourceRange));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPartCopy"),
            new TeaPair("version", "2019-05-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/" + key + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "xml"),
            new TeaPair("bodyType", "xml")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UploadPartCopyResponse());
    }

    public UploadPartCopyResponse uploadPartCopy(String bucket, String key, UploadPartCopyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UploadPartCopyHeaders headers = new UploadPartCopyHeaders();
        return this.uploadPartCopyWithOptions(bucket, key, request, headers, runtime);
    }
}
