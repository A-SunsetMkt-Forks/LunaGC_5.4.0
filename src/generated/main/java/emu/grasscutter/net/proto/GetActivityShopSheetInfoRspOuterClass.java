// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetActivityShopSheetInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetActivityShopSheetInfoRspOuterClass {
  private GetActivityShopSheetInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetActivityShopSheetInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetActivityShopSheetInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> 
        getSheetInfoListList();
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(int index);
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    int getSheetInfoListCount();
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> 
        getSheetInfoListOrBuilderList();
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 shop_type = 9;</code>
     * @return The shopType.
     */
    int getShopType();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code GetActivityShopSheetInfoRsp}
   */
  public static final class GetActivityShopSheetInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetActivityShopSheetInfoRsp)
      GetActivityShopSheetInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetActivityShopSheetInfoRsp.newBuilder() to construct.
    private GetActivityShopSheetInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetActivityShopSheetInfoRsp() {
      sheetInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetActivityShopSheetInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetActivityShopSheetInfoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sheetInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              sheetInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.parser(), extensionRegistry));
              break;
            }
            case 72: {

              shopType_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          sheetInfoList_ = java.util.Collections.unmodifiableList(sheetInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.class, emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.Builder.class);
    }

    public static final int SHEET_INFO_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> sheetInfoList_;
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> getSheetInfoListList() {
      return sheetInfoList_;
    }
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> 
        getSheetInfoListOrBuilderList() {
      return sheetInfoList_;
    }
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    @java.lang.Override
    public int getSheetInfoListCount() {
      return sheetInfoList_.size();
    }
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(int index) {
      return sheetInfoList_.get(index);
    }
    /**
     * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(
        int index) {
      return sheetInfoList_.get(index);
    }

    public static final int SHOP_TYPE_FIELD_NUMBER = 9;
    private int shopType_;
    /**
     * <code>uint32 shop_type = 9;</code>
     * @return The shopType.
     */
    @java.lang.Override
    public int getShopType() {
      return shopType_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < sheetInfoList_.size(); i++) {
        output.writeMessage(7, sheetInfoList_.get(i));
      }
      if (shopType_ != 0) {
        output.writeUInt32(9, shopType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < sheetInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, sheetInfoList_.get(i));
      }
      if (shopType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, shopType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp other = (emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp) obj;

      if (!getSheetInfoListList()
          .equals(other.getSheetInfoListList())) return false;
      if (getShopType()
          != other.getShopType()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getSheetInfoListCount() > 0) {
        hash = (37 * hash) + SHEET_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSheetInfoListList().hashCode();
      }
      hash = (37 * hash) + SHOP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShopType();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GetActivityShopSheetInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetActivityShopSheetInfoRsp)
        emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.class, emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSheetInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (sheetInfoListBuilder_ == null) {
          sheetInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          sheetInfoListBuilder_.clear();
        }
        shopType_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.internal_static_GetActivityShopSheetInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp build() {
        emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp result = new emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (sheetInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            sheetInfoList_ = java.util.Collections.unmodifiableList(sheetInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.sheetInfoList_ = sheetInfoList_;
        } else {
          result.sheetInfoList_ = sheetInfoListBuilder_.build();
        }
        result.shopType_ = shopType_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp.getDefaultInstance()) return this;
        if (sheetInfoListBuilder_ == null) {
          if (!other.sheetInfoList_.isEmpty()) {
            if (sheetInfoList_.isEmpty()) {
              sheetInfoList_ = other.sheetInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSheetInfoListIsMutable();
              sheetInfoList_.addAll(other.sheetInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.sheetInfoList_.isEmpty()) {
            if (sheetInfoListBuilder_.isEmpty()) {
              sheetInfoListBuilder_.dispose();
              sheetInfoListBuilder_ = null;
              sheetInfoList_ = other.sheetInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              sheetInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSheetInfoListFieldBuilder() : null;
            } else {
              sheetInfoListBuilder_.addAllMessages(other.sheetInfoList_);
            }
          }
        }
        if (other.getShopType() != 0) {
          setShopType(other.getShopType());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> sheetInfoList_ =
        java.util.Collections.emptyList();
      private void ensureSheetInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sheetInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo>(sheetInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> sheetInfoListBuilder_;

      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> getSheetInfoListList() {
        if (sheetInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(sheetInfoList_);
        } else {
          return sheetInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public int getSheetInfoListCount() {
        if (sheetInfoListBuilder_ == null) {
          return sheetInfoList_.size();
        } else {
          return sheetInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo getSheetInfoList(int index) {
        if (sheetInfoListBuilder_ == null) {
          return sheetInfoList_.get(index);
        } else {
          return sheetInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder setSheetInfoList(
          int index, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
        if (sheetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSheetInfoListIsMutable();
          sheetInfoList_.set(index, value);
          onChanged();
        } else {
          sheetInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder setSheetInfoList(
          int index, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
        if (sheetInfoListBuilder_ == null) {
          ensureSheetInfoListIsMutable();
          sheetInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          sheetInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder addSheetInfoList(emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
        if (sheetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSheetInfoListIsMutable();
          sheetInfoList_.add(value);
          onChanged();
        } else {
          sheetInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder addSheetInfoList(
          int index, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo value) {
        if (sheetInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSheetInfoListIsMutable();
          sheetInfoList_.add(index, value);
          onChanged();
        } else {
          sheetInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder addSheetInfoList(
          emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
        if (sheetInfoListBuilder_ == null) {
          ensureSheetInfoListIsMutable();
          sheetInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          sheetInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder addSheetInfoList(
          int index, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder builderForValue) {
        if (sheetInfoListBuilder_ == null) {
          ensureSheetInfoListIsMutable();
          sheetInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          sheetInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder addAllSheetInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo> values) {
        if (sheetInfoListBuilder_ == null) {
          ensureSheetInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, sheetInfoList_);
          onChanged();
        } else {
          sheetInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder clearSheetInfoList() {
        if (sheetInfoListBuilder_ == null) {
          sheetInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          sheetInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public Builder removeSheetInfoList(int index) {
        if (sheetInfoListBuilder_ == null) {
          ensureSheetInfoListIsMutable();
          sheetInfoList_.remove(index);
          onChanged();
        } else {
          sheetInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder getSheetInfoListBuilder(
          int index) {
        return getSheetInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder getSheetInfoListOrBuilder(
          int index) {
        if (sheetInfoListBuilder_ == null) {
          return sheetInfoList_.get(index);  } else {
          return sheetInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> 
           getSheetInfoListOrBuilderList() {
        if (sheetInfoListBuilder_ != null) {
          return sheetInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(sheetInfoList_);
        }
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder addSheetInfoListBuilder() {
        return getSheetInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder addSheetInfoListBuilder(
          int index) {
        return getSheetInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityShopSheetInfo sheet_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder> 
           getSheetInfoListBuilderList() {
        return getSheetInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder> 
          getSheetInfoListFieldBuilder() {
        if (sheetInfoListBuilder_ == null) {
          sheetInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfo.Builder, emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.ActivityShopSheetInfoOrBuilder>(
                  sheetInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          sheetInfoList_ = null;
        }
        return sheetInfoListBuilder_;
      }

      private int shopType_ ;
      /**
       * <code>uint32 shop_type = 9;</code>
       * @return The shopType.
       */
      @java.lang.Override
      public int getShopType() {
        return shopType_;
      }
      /**
       * <code>uint32 shop_type = 9;</code>
       * @param value The shopType to set.
       * @return This builder for chaining.
       */
      public Builder setShopType(int value) {
        
        shopType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shop_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearShopType() {
        
        shopType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetActivityShopSheetInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetActivityShopSheetInfoRsp)
    private static final emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetActivityShopSheetInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetActivityShopSheetInfoRsp>() {
      @java.lang.Override
      public GetActivityShopSheetInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetActivityShopSheetInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetActivityShopSheetInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetActivityShopSheetInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetActivityShopSheetInfoRspOuterClass.GetActivityShopSheetInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetActivityShopSheetInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!GetActivityShopSheetInfoRsp.proto\032\033Act" +
      "ivityShopSheetInfo.proto\"r\n\033GetActivityS" +
      "hopSheetInfoRsp\022/\n\017sheet_info_list\030\007 \003(\013" +
      "2\026.ActivityShopSheetInfo\022\021\n\tshop_type\030\t " +
      "\001(\r\022\017\n\007retcode\030\016 \001(\005B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.getDescriptor(),
        });
    internal_static_GetActivityShopSheetInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetActivityShopSheetInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetActivityShopSheetInfoRsp_descriptor,
        new java.lang.String[] { "SheetInfoList", "ShopType", "Retcode", });
    emu.grasscutter.net.proto.ActivityShopSheetInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
